package com.example.demetrius.espetinhohome;

import android.widget.EditText;

/**
 * Created by Demetrius on 09/08/2016.
 */
public class Espeto {
    private String tipo;
    private int quantdade,espeto;

    public Espeto(){

    }

    public Espeto(String tipo, int quantdade, int espeto) {
        this.tipo = tipo;
        this.quantdade = quantdade;
        this.espeto = espeto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantdade() {
        return quantdade;
    }

    public void setQuantdade(int quantdade) {
        this.quantdade = quantdade;
    }

    public int getEspeto() {
        return espeto;
    }

    public void setEspeto(int espeto) {
        this.espeto = espeto;
    }

    @Override
    public String toString() {
        return "Espeto{" +
                "tipo='" + tipo + '\'' +
                ", quantidade=" + quantdade +
                ", espeto=" + espeto +
                '}';
    }
}
