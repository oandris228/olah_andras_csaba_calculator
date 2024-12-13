module com.example.calculator2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator2 to javafx.fxml;
    exports com.example.calculator2;
}