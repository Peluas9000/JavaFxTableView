module benjaddi.ayoub.ejerciciosclase {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.base;

    opens benjaddi.ayoub.ejerciciosclase to javafx.fxml;
    exports benjaddi.ayoub.ejerciciosclase;
}
