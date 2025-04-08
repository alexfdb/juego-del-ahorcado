package es.ies.puerto.controller;

import es.ies.puerto.controller.pantalla.PantallaController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class NivelController extends PantallaController {

    @FXML
    private TextField textFieldUsuario;
    @FXML
    private TextField textFieldEmail;
    @FXML
    private TextField textFieldNivel;
    @FXML
    private ComboBox comboBoxDificultad;
    @FXML
    private Button buttonEditar;
    @FXML
    private Button buttonJugar;
    @FXML
    private Button buttonRegresar;

    private String dificultad;

    public NivelController() {
        this.dificultad = "Facil";
    }

    public void initialize() {
        comboBoxDificultad.getItems().addAll("Facil", "Normal", "Dificil");
    }

    public String palabra() {
        return null;
    }

    /**
     * Cambia el valor de la dificultad.
     */
    public void comboBoxDificultadClick() {
        dificultad = comboBoxDificultad.getValue().toString();
    }

    /**
     * Cambia a la pantalla registrar.
     */
    public void buttonEditarClick() {
        pantallaRegistrar(buttonEditar);
    }

    /**
     * Cambia a la pantalla jugar.
     */
    public void buttonJugarClick() {
        JugarController controller = (JugarController) pantallaJugar(buttonJugar);
        controller.setTextDificultad(dificultad);
        
    }

    /**
     * Cambia a la pantalla recuperar.
     */
    public void buttonRegresarClick() {
        pantallaIniciar(buttonRegresar);
    }

}