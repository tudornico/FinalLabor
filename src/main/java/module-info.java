module com.example.finallabor {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;
    requires java.xml;
    requires java.sql;
    requires java.datatransfer;
    requires java.desktop;
    requires javafx.graphics;



    exports com.example.finallabor;
    opens com.example.finallabor to javafx.fxml;

}