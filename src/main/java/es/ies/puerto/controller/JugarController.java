package es.ies.puerto.controller;

import es.ies.puerto.controller.pantalla.PantallaController;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

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
    private Text textIntentos;
    @FXML
    private Button buttonReiniciar;
    @FXML
    private Button buttonRegresar;
    @FXML
    private Button buttonAdivinar;
    @FXML
    private TextField textInputLetra;

    private final Random random = new Random();
    private String palabraSecreta;
    private Set<Character> letrasAdivinadas = new HashSet<>();
    private Set<Character> letrasIncorrectas = new HashSet<>();
    private int intentosRestantes;

    @FXML
    public void initialize() {
        textDificultad.setText("Medio");
        this.palabraSecreta = palabra();
        this.letrasAdivinadas.clear();
        this.letrasIncorrectas.clear();
        this.intentosRestantes = 6;
        actualizarTextoPalabra();
        textIntentos.setText("Intentos restantes: " + intentosRestantes);
    }

    @FXML
    public void setTextDificultad(String dificultad) {
        this.textDificultad.setText(dificultad);
    }

    public void buttonReiniciarClick() {
        this.palabraSecreta = palabra();
        this.letrasAdivinadas.clear();
        this.letrasIncorrectas.clear();
        this.intentosRestantes = 6;
        actualizarTextoPalabra();
        textIntentos.setText("Intentos restantes: " + intentosRestantes);
    }

    public void buttonRegresarClick() {
        pantallaNivel(buttonRegresar);
    }

    private void actualizarTextoPalabra() {
        StringBuilder palabraActualizada = new StringBuilder();
        for (char letra : palabraSecreta.toCharArray()) {
            if (letrasAdivinadas.contains(letra)) {
                palabraActualizada.append(letra);
            } else {
                palabraActualizada.append("_");
            }
            palabraActualizada.append(" ");
        }
        textPalabra.setText(palabraActualizada.toString().trim());
    }

    /**
     * Método para ser llamado cuando el jugador hace clic en el botón "Adivinar"
     */
    @FXML
    public void buttonAdivinarClick() {
        String input = textInputLetra.getText().toLowerCase();
        
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            mostrarMensaje("Por favor, ingresa solo una letra.");
            textInputLetra.clear();
            return;
        }
        
        char letra = input.charAt(0);
        
        if (letrasAdivinadas.contains(letra) || letrasIncorrectas.contains(letra)) {
            return;
        }

        if (palabraSecreta.contains(String.valueOf(letra))) {
            letrasAdivinadas.add(letra);
        } else {
            letrasIncorrectas.add(letra);
            intentosRestantes--;
        }

        actualizarTextoPalabra();
        textIntentos.setText("Intentos restantes: " + intentosRestantes);

        if (intentosRestantes <= 0) {
            mostrarMensaje("¡Has perdido! La palabra era: " + palabraSecreta);
        } else if (todasLasLetrasAdivinadas()) {
            mostrarMensaje("¡Has ganado! La palabra es correcta.");
        }

        textInputLetra.clear();
    }

    private boolean todasLasLetrasAdivinadas() {
        for (char letra : palabraSecreta.toCharArray()) {
            if (!letrasAdivinadas.contains(letra)) {
                return false;
            }
        }
        return true;
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Juego de Ahorcado");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    public String palabra() {
        String[] palabrasFacil = {"gato", "sol", "luna", "pan", "mesa", "vaca", "rojo", "agua", "flor", "piedra"};
        String[] palabrasMedia = {"manzana", "elefante", "ratonera", "pelota", "correr", "ciclismo", "camino", "florero", "libreria", "reptil"};
        String[] palabrasDificil = {"computadora", "electricidad", "matematicas", "biblioteca", "desarrollador", "inmortal", "jurisprudencia", "hipopotamo", "microorganismo", "revolucion"};
    
        String[] palabrasSeleccionadas;
    
        switch (textDificultad.getText()) {
            case "Facil":
                palabrasSeleccionadas = palabrasFacil;
                break;
            case "Dificil":
                palabrasSeleccionadas = palabrasDificil;
                break;
            default:
                palabrasSeleccionadas = palabrasMedia;
                break;
        }
        int indiceAleatorio = random.nextInt(palabrasSeleccionadas.length);
        return palabrasSeleccionadas[indiceAleatorio];
    }

}
