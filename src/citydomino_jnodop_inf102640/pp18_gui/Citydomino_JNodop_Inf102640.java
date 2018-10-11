package citydomino_jnodop_inf102640.pp18_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Johannes Nodop INF102640
 */
public class Citydomino_JNodop_Inf102640 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);
        
        stage.setMinWidth(800);
        stage.setMinHeight(800);
        stage.setScene(scene);
        stage.setTitle("CityDomino");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
