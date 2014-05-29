/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

/**
 *
 * @author DAM
 */
import java.util.*;
public class Medicamento {
    enum Receta {
    // Tipos de Medicamento.
    CONRECETA, SINRECETA;
    }

    private String nombre;
    private Calendar fechaFab,fechaCad;
    private int unidades;
    private Double precio;
    private Receta receta;
    private ArrayList principios=new ArrayList<Principio>();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaFab(Calendar fechaFab) {
        this.fechaFab = fechaFab;
    }

    public void setFechaCad(Calendar fechaCad) {
        this.fechaCad = fechaCad;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setReceta(String receta) {
        if(receta.equals("N"))this.receta = Receta.SINRECETA;
        if(receta.equals("Y"))this.receta = Receta.CONRECETA;

    }

    public void setPrincipios(ArrayList principios) {
        this.principios = principios;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    
    
}
