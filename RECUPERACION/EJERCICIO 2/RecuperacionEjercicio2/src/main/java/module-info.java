module com.example.recuperacionejercicio2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.recuperacionejercicio2 to javafx.fxml;
    exports com.example.recuperacionejercicio2;
}