package es.ies.puerto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class PrincipalApplication extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("iniciar.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 340, 640);
        stage.setTitle("Soy tu primera app visual!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}