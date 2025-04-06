package es.ies.puerto.controller;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import es.ies.puerto.controller.pantalla.PantallaController;
import es.ies.puerto.model.Usuario;
import es.ies.puerto.model.UsuarioManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class RegistrarController extends PantallaController {

    @FXML
    private TextField textFieldUsuario;
    @FXML
    private TextField textFieldEmail;
    @FXML
    private PasswordField passwordFieldContrasenia;
    @FXML
    private Text textMensaje;
    @FXML
    private Button buttonGuardar;
    @FXML
    private Button buttonRegresar;

    private UsuarioManager uManager;

    /**
     * Constructor general.
     * 
     * @throws SQLException error controlado.
     */
    public RegistrarController() throws SQLException {
        this.uManager = new UsuarioManager();
    }

    /**
     * Guarda el registro.
     */
    public void buttonGuardarClick() {
        if (!validarCampos()) {
            textMensaje.setText("Credenciales invalidas");
            return;
        }
        if (!validarEmail()) {
            textMensaje.setText("El formato del email es incorrecto");
            return;
        }
        Usuario usuario = new Usuario(textFieldUsuario.getText(), passwordFieldContrasenia.getText(), textFieldEmail.getText());
        uManager.crearUsuario(usuario);
        textMensaje.setText("Registro correcto");
    }

    /**
     * Cambia a la pantalla Iniciar.
     */
    public void buttonRegresarClick() {
        pantallaIniciar(buttonRegresar);
    }

    /**
     * Valida que el formato del email sea el correcto.
     * 
     * @return retorna true si el formato es correcto.
     */
    private boolean validarEmail() {
        String patron = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(textFieldEmail.getText());
        return matcher.matches();
    }

    /**
     * Valida que los campos no sean null ni esten vacios.
     * 
     * @return retorna true si los campos son validados.
     */
    private boolean validarCampos() {
        return textFieldUsuario != null && !textFieldUsuario.getText().isBlank() &&
                textFieldEmail != null && !textFieldEmail.getText().isBlank() &&
                passwordFieldContrasenia != null && !passwordFieldContrasenia.getText().isBlank();
    }

}