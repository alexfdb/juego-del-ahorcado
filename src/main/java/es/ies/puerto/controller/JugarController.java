package es.ies.puerto.controller;

import es.ies.puerto.controller.pantalla.PantallaController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.util.Objects;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class JugarController extends PantallaController {

    @FXML
    private Button buttonRegresar;

    private String dificultad;

    public void initialize() {
        this.dificultad = getDificultad();
    }

    public String getDificultad() {
        return this.dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * Cambia a la pantalla nivel.
     */
    public void buttonRegresarClick() {
        pantallaNivel(buttonRegresar);
    }

}