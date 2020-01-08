module com.github.akramov.controller {
    requires com.github.akramov.bd;
    requires javafx.fxml;
    requires javafx.controls;

    exports controller to javafx.graphics, javafx.fxml;
    opens controller to javafx.fxml;
}
