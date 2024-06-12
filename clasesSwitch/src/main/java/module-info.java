module com.example.clasesswitch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clasesswitch to javafx.fxml;
    exports com.example.clasesswitch;
}