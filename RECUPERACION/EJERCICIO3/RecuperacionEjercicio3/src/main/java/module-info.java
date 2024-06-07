module com.example.recuperacionejercicio3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.recuperacionejercicio3 to javafx.fxml;
    exports com.example.recuperacionejercicio3;
}