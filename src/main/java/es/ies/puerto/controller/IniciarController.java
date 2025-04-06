package es.ies.puerto.controller;

import es.ies.puerto.controller.pantalla.Pantalla;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class IniciarController extends Pantalla {

    @FXML
    private Button buttonAceptar;
    @FXML
    private Button buttonRegistrar;
    @FXML
    private Button buttonRecuperar;

    /**
     * Cambia a la pantalla nivel.
     */
    public void buttonAceptarClick() {
        pantallaNivel(buttonAceptar);
    }

    /**
     * Cambia a la pantalla registrar.
     */
    public void buttonRegistrarClick() {
        pantallaRegistrar(buttonRegistrar);
    }

    /**
     * Cambia a la pantalla recuperar.
     */
    public void buttonRecuperarClick() {
        pantallaRecuperar(buttonRecuperar);
    }

}