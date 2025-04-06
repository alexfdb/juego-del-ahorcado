package es.ies.puerto.controller;

import es.ies.puerto.controller.pantalla.Pantalla;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class NivelController extends Pantalla {

    @FXML
    private Button buttonEditar;
    @FXML
    private Button buttonJugar;
    @FXML
    private Button buttonRegresar;

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
        pantallaJugar(buttonJugar);
    }

    /**
     * Cambia a la pantalla recuperar.
     */
    public void buttonRegresarClick() {
        pantallaIniciar(buttonRegresar);
    }

}