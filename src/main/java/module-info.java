module banks.main {
    requires javafx.controls;
    requires javafx.fxml;


    opens banks.main to javafx.fxml;
    exports banks.main;
}