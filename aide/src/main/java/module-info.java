module com.inteliense.aide {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.inteliense.aide to javafx.fxml;
    exports com.inteliense.aide;
}