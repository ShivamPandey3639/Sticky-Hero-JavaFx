module com.example.stickyhero {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stickyhero to javafx.fxml;
    exports com.example.stickyhero;
}