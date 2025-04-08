package es.ies.puerto.controller;

import java.sql.SQLException;

import es.ies.puerto.controller.pantalla.PantallaController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class JugarController extends PantallaController {

    @FXML
    private Text textUsuario;
    @FXML
    private Text textDificultad;
    @FXML
    private Text textPalabra;
    @FXML
    private Button buttonReiniciar;
    @FXML
    private Button buttonRegresar;

    @FXML
    public void initialize() {
        textDificultad.setText("Facil");
    }

    @FXML
    public void setTextDificultad(String dificultad) {
        this.textDificultad.setText(dificultad);
    }

    /**
     * Reinicia la palabra.
     */
    public void buttonReiniciarClick() {
    }

    /**
     * Cambia a la pantalla nivel.
     */
    public void buttonRegresarClick() {
        pantallaNivel(buttonRegresar);
    }

}