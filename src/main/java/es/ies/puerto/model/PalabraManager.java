package es.ies.puerto.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import es.ies.puerto.model.database.DatabaseManager;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class PalabraManager extends DatabaseManager {

    /**
     * Constructor general.
     * 
     * @throws SQLException error controlado.
     */
    public PalabraManager() throws SQLException {
        super();
    }

    public String buscarPalabraPorTamano(String dificultad) throws SQLException {
        if (dificultad == null) {
            return null;
        }
        String query = "";
        switch (dificultad) {
            case "Facil":
                query = "SELECT palabra FROM usuario WHERE LENGTH(palabra) <= 5 LIMIT 1";
                break;
            case "Normal":
                query = "SELECT palabra FROM usuario WHERE LENGTH(palabra) BETWEEN 6 AND 10 LIMIT 1";
                break;
            default:
                query = "SELECT palabra FROM usuario WHERE LENGTH(palabra) >= 11 LIMIT 1";
                break;
        }
        try (PreparedStatement pStatement = conectar().prepareStatement(query);
                ResultSet rSet = pStatement.executeQuery()) {

            if (rSet.next()) {
                return rSet.getString("palabra");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}