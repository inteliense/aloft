package org.extendedweb.aloft.lib.http.protocol.responses.defined;

//import at.favre.lib.crypto.bcrypt.BCrypt;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.http.protocol.responses.base.DefinedResponse;
import org.extendedweb.aloft.lib.http.protocol.responses.base.ResponseObject;
import org.extendedweb.aloft.lib.http.supporting.*;
import org.extendedweb.aloft.lib.lang.types.t.StringT;
import org.extendedweb.aloft.utils.data.Hex;
import org.extendedweb.aloft.utils.data.JSON;
import org.extendedweb.aloft.utils.encryption.AES;
import org.extendedweb.aloft.utils.encryption.Rand;
import org.extendedweb.aloft.utils.encryption.SHA;
import org.json.simple.JSONObject;

import java.util.Arrays;

public class ApplicationInfoResponse extends DefinedResponse {

    public ApplicationInfoResponse(RequestParams params, AppConfig config) {
        super(params, config);
    }

    @Override
    protected ResponseObject buildResponse() {
        ResponseObject root = new ResponseObject("application");
        root.put("name", new StringT().value(config.getName()));
        String[] keys = getClientKeys();
        root.put("key", new StringT().value(keys[0]));
        root.put("client_key", new StringT().value(keys[1]));
        root.put("version", new StringT().value(keys[2]));
        root.put("pkg", new StringT().value(config.getPkg()));
        root.put("mode", new StringT().value(config.getMode()));

        ResponseObject routes = new ResponseObject("endpoints");
        routes.put("state", new StringT().value((String) config.getRoutesConfig().state()));
        System.out.println(JSON.getString(routes.json()));

        root.put(routes);
        return root;
    }

    private String[] getClientKeys() {
        String appKey = Hex.getHex(Rand.secure(32, config.getKey()));

        String clientRandom = params.getHeaders().get("X-Aloft-Client-Id");
        byte[] sortedClientRandom = Hex.fromHex(clientRandom);
        Arrays.sort(sortedClientRandom, 0, sortedClientRandom.length - 1);
        String clientRandomStr = Hex.getHex(sortedClientRandom);

        String rawClientKey = SHA.getHmac256(clientRandomStr, config.getKey());
        String clientKey = Hex.getHex(AES.ecb(Hex.fromHex(rawClientKey), Hex.fromHex(clientRandom), true, true));
        System.out.println(rawClientKey);
        System.out.println(clientKey);
        System.out.println(Hex.getHex(AES.ecb(Hex.fromHex(clientKey), Hex.fromHex(clientRandom), true, false)));

        String appVersion = ""; // BCrypt.hashpw(rawClientKey, BCrypt.gensalt());

        System.out.println("\n\n" + rawClientKey + "\n");
        return new String[]{appKey, clientKey, appVersion};
    }

}
