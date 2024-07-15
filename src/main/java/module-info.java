module com.example.standardhello {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.standardhello to javafx.fxml;
    exports com.example.standardhello;
}