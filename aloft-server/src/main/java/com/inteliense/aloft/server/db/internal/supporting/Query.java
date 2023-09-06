package com.inteliense.aloft.server.db.internal.supporting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Query {

    private String database;
    private String table;
    private boolean all = false;
    private ArrayList<Field> select = new ArrayList<Field>();
    private ArrayList<Field> update = new ArrayList<Field>();
    private ArrayList<Field> insert = new ArrayList<Field>();
    private ArrayList<Condition> where = new ArrayList<Condition>();
    private ArrayList<Join> join = new ArrayList<Join>();
    private QueryTypes type; //TODO get rid of QueryTypes type

    private DbConnection connection;

    public Query(DbConnection connection) {
        this.connection = connection;
    }

    public Query database(String database) {
        this.database = database;
        return this;
    }

    public Query table(String table) {
        this.table = table;
        return this;
    }

//    public Query database(String database, boolean create) {
//        this.database = table;
//        if(create) {
//
//        }
//        return this;
//    }

//    public Query table(String table, String[] fields) {
//        this.table = table;
//        if(fields.length > 0) {
//
//        }
//        return this;
//    }

    public Query select() {
        type = QueryTypes.SELECT;
        all = true;
        return this;
    }

    public Query select(String... columns) {
        type = QueryTypes.SELECT;
        for(String column: columns) {
            select.add(new Field(column, null));
        }
        return this;
    }

    public Query insert(HashMap<String, Object> toInsert) {

        type = QueryTypes.INSERT;

        for(String key : toInsert.keySet()) {
            Object value = toInsert.get(key);
            insert(key, value);
        }

        return this;
    }

    public Query insert(String column, Object value) {
        type = QueryTypes.INSERT;

        Field field = new Field(column, value);
        insert.add(field);
        return this;
    }

    public Query update(HashMap<String, Object> toUpdate) {

        type = QueryTypes.UPDATE;

        for(String key : toUpdate.keySet()) {
            Object value = toUpdate.get(key);
            update(key, value);
        }

        return this;
    }

    public Query update(String column, Object value) {
        type = QueryTypes.UPDATE;

        Field field = new Field(column, value);
        update.add(field);
        return this;
    }

    public Query where(ArrayList<Condition> conditions) {
        this.where.addAll(conditions);
        return this;
    }

    public Query where(Condition[] conditions) {
        this.where.addAll(Arrays.asList(conditions));
        return this;
    }

    public Query where(Condition value) {
        where.add(value);
        return this;
    }

    public Query orWhere(ArrayList<Condition> conditions) {
        for(Condition condition : conditions) {
            condition.or();
        }
        this.where.addAll(conditions);
        return this;
    }

    public Query orWhere(Condition[] conditions) {
        for(Condition condition : conditions) {
            condition.or();
        }
        this.where.addAll(Arrays.asList(conditions));
        return this;
    }

    public Query orWhere(Condition value) {
        value.or();
        where.add(value);
        return this;
    }

    public Query whereNull(String column) {
        Condition c = new Condition(column, null);
        where.add(c);
        return this;
    }

    public Query orWhereNull(String column) {
        Condition c = new Condition(column, null);
        c.or();
        where.add(c);
        return this;
    }

    public Query whereSet(String column) {
        Condition c = new Condition(column, Operator.NOT_NULL);
        where.add(c);
        return this;
    }

    public Query orWhereSet(String column) {
        Condition c = new Condition(column, Operator.NOT_NULL);
        c.or();
        where.add(c);
        return this;
    }

    public Query whereDeleted(String column) {
        Condition c = new Condition(column, Operator.SOFT_DELETED);
        where.add(c);
        return this;
    }

    public Query orWhereDeleted(String column) {
        Condition c = new Condition(column, Operator.SOFT_DELETED);
        where.add(c);
        where.add(c);
        return this;
    }

    public Query beginGroup() {
        where.add(Condition.GROUP_BEGIN());
        return this;
    }

    public Query closeGroup() {
        where.add(Condition.GROUP_END());
        return this;
    }

    public void delete() {
        type = QueryTypes.DELETE;
        run();
    }

    public void softDelete() {
        run();
    }

    public QueryResults get() {
        QueryAdapter qa = new QueryAdapter(connection);
        return qa.q(this);
    }

    public void run() {
        QueryAdapter qa = new QueryAdapter(connection);
        qa.q(this);
    }

    public QueryParams p() {
        QueryParams params = new QueryParams(
                database,
                table,
                all,
                select,
                update,
                insert,
                where,
                type
        );
        return params;
    }

}