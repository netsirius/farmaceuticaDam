/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

import java.io.Serializable;

/**
 *
 * @author DAM
 */
public class Principio implements Serializable{
    private String nombre;
    private double miligramos;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMiligramos(double miligramos) {
        this.miligramos = miligramos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMiligramos() {
        return miligramos;
    }
    
}
