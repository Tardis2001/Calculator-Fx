module com.matheus.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens com.matheus.calculatorfx to javafx.fxml;
    exports com.matheus.calculatorfx;
}