module music.ui.start {
 requires javafx.graphics;
 requires javafx.base;
    requires java.sql;
    requires javafx.fxml;
    requires javafx.controls;

    exports  sample to javafx.graphics, javafx.fxml;
    opens sample to javafx.fxml;
    opens sample.model to javafx.base;
}