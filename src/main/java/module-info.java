module com.example.assignment1gc200489011 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.assignment1gc200489011 to javafx.fxml;
    exports com.example.assignment1gc200489011;
}