package es.ies.puerto.model;

import java.util.Objects;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Palabra {

    private String palabraValor;

    /**
     * Constructor vacio.
     */
    public Palabra() {
    }

    /**
     * Constructor general.
     * 
     * @param palabra
     */
    public Palabra(String palabra) {
        this.palabraValor = palabra;
    }

    public String getPalabraValor() {
        return this.palabraValor;
    }

    public void setPalabraValor(String palabra) {
        this.palabraValor = palabra;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Palabra)) {
            return false;
        }
        Palabra obj = (Palabra) o;
        return Objects.equals(palabraValor, obj.palabraValor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palabraValor);
    }

    @Override
    public String toString() {
        return getPalabraValor();
    }

}