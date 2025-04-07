package es.ies.puerto.controller;

import java.sql.SQLException;
import java.util.List;

import es.ies.puerto.controller.pantalla.PantallaController;
import es.ies.puerto.model.Usuario;
import es.ies.puerto.model.UsuarioManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class UsuariosController extends PantallaController {

    @FXML
    private Text textLista;
    @FXML
    private Button buttonRegresar;

    private UsuarioManager usuarioManager;
    private List<Usuario> usuarios;
    private String usuariosString;

    @FXML
    public void initialize() {
        mostrarUsuarios();
    }

    /**
     * Constructor general.
     * @throws SQLException error controlado.
     */
    public UsuariosController() throws SQLException {
        this.usuarioManager = new UsuarioManager();
        this.usuarios = usuarioManager.obtenerUsuarios();
        this.usuariosString = "";
    }

    /**
     * Muestra todos los usuarios.
     */
    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            usuariosString += usuario.getNombre()+"\n" ;
        }
        textLista.setText(usuariosString);
    }

    /**
     * Cambia a la pantalla inicio.
     */
    @FXML
    public void buttonRegresarClick() {
        pantallaIniciar(buttonRegresar);
    }
    
}
