module com.example.nextstep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nextstep to javafx.fxml;
    exports com.example.nextstep;
}