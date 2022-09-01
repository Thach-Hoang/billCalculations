module com.example.billcalculations {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.billcalculations to javafx.fxml;
    exports com.example.billcalculations;
}