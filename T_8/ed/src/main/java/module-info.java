module com.example.ed {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ed to javafx.fxml;
    exports com.example.ed;
}