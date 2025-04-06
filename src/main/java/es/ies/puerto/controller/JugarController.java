package es.ies.puerto.controller;

import es.ies.puerto.controller.pantalla.Pantalla;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class JugarController extends Pantalla {

    @FXML
    private Button buttonRegresar;

    /**
     * Cambia a la pantalla nivel.
     */
    public void buttonRegresarClick() {
        pantallaNivel(buttonRegresar);
    }

}