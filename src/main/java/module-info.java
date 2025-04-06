module es.ies.puerto {
    requires javafx.fxml;
    requires javafx.controls;
    requires org.controlsfx.controls;
    requires transitive javafx.graphics;

    exports es.ies.puerto;
    exports es.ies.puerto.controller;

    opens es.ies.puerto to javafx.fxml;
    opens es.ies.puerto.controller to javafx.fxml;
}