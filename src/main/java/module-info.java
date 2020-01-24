module com.pondpike {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pondpike to javafx.fxml;
    exports com.pondpike;
}