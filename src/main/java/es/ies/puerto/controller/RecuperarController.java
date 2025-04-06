package es.ies.puerto.controller;

import es.ies.puerto.controller.pantalla.PantallaController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class RecuperarController extends PantallaController {

    @FXML
    private Button buttonRegresar;

    /**
     * Cambia a la pantalla iniciar.
     */
    public void buttonRegresarClick() {
        pantallaIniciar(buttonRegresar);
    }

}