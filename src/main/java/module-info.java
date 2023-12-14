module application.demo5j11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.demo5j11 to javafx.fxml;
    exports application.demo5j11;
}