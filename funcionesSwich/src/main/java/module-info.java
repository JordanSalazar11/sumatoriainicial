module com.example.funcionesswich {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.funcionesswich to javafx.fxml;
    exports com.example.funcionesswich;
}