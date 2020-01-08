module com.github.akramov.controller {
    requires com.github.akramov.bd;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires com.github.akramov.common;

    exports controller to javafx.graphics, javafx.fxml;
    opens controller to javafx.fxml;
}
