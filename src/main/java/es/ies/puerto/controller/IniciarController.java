package es.ies.puerto.controller;

import java.sql.SQLException;

import es.ies.puerto.controller.pantalla.PantallaController;
import es.ies.puerto.model.UsuarioManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class IniciarController extends PantallaController {

    @FXML
    private TextField textFieldUsuario;
    @FXML
    private TextField passwordFieldContrasenia;
    @FXML
    private Text textMensaje;
    @FXML
    private Button buttonAceptar;
    @FXML
    private Button buttonRegistrar;
    @FXML
    private Button buttonRecuperar;

    private UsuarioManager uManager;

    /**
     * Constructor general.
     * 
     * @throws SQLException error controlado.
     */
    public IniciarController() throws SQLException {
        this.uManager = new UsuarioManager();
    }

    /**
     * Cambia a la pantalla nivel.
     */
    public void buttonAceptarClick() {
        if (!validarCampos()) {
            textMensaje.setText("Credenciales invalidas");
            return;
        }
        if (!uManager.iniciarSesion(textFieldUsuario.getText(), passwordFieldContrasenia.getText())) {
            textMensaje.setText("Credenciales incorrectas");
            return;
        }
        textMensaje.setText("");
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

    /**
     * Valida que los campos no sean null ni esten vacios.
     * 
     * @return retorna true si los campos son validados.
     */
    private boolean validarCampos() {
        return textFieldUsuario != null && !textFieldUsuario.getText().isBlank() &&
                passwordFieldContrasenia != null && !passwordFieldContrasenia.getText().isBlank();
    }

}