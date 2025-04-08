package es.ies.puerto.controller.pantalla;

import es.ies.puerto.PrincipalApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public abstract class PantallaController {

    /**
     * Ejecuta el cambio de pantalla.
     * 
     * @param button   boton a ejecutar.
     * @param fxmlPath path del fxml.
     */
    private Object cambiarPantalla(Button button, String fxmlPath) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource(fxmlPath));
            Scene scene = new Scene(fxmlLoader.load(), 340, 640);
            Stage stage = (Stage) button.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
            return fxmlLoader.getController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Cambia a la pantalla iniciar.
     * 
     * @param button boton a ejecutar.
     */
    public Object pantallaIniciar(Button button) {
        return cambiarPantalla(button, "iniciar.fxml");
    }

    /**
     * Cambia a la pantalla nivel.
     * 
     * @param button boton a ejecutar.
     */
    public void pantallaNivel(Button button) {
        cambiarPantalla(button, "nivel.fxml");
    }

    /**
     * Cambia a la pantalla recuperar.
     * 
     * @param button boton a ejecutar.
     */
    public void pantallaRecuperar(Button button) {
        cambiarPantalla(button, "recuperar.fxml");
    }

    /**
     * Cambia a la pantalla registrar.
     * 
     * @param button boton a ejecutar.
     */
    public void pantallaRegistrar(Button button) {
        cambiarPantalla(button, "registrar.fxml");
    }

    /**
     * Cambia a la pantalla jugar.
     * 
     * @param button boton a ejecutar.
     */
    public Object pantallaJugar(Button button) {
        return cambiarPantalla(button, "jugar.fxml");
    }

    /**
     * Cambia a la pantalla usuarios.
     * 
     * @param button boton a ejecutar.
     */
    public void pantallaUsuarios(Button button) {
        cambiarPantalla(button, "usuarios.fxml");
    }

}