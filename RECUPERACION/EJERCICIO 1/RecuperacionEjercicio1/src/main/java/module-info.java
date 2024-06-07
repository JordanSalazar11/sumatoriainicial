module com.example.recuperacionejercicio1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.recuperacionejercicio1 to javafx.fxml;
    exports com.example.recuperacionejercicio1;
}