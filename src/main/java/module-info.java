module com.example.javafx3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javafx3 to javafx.fxml;
    exports com.example.javafx3;
}