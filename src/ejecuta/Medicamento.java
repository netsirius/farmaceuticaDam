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
public class Medicamento implements Comparable{
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

    public String getNombre() {
        return nombre;
    }

    public Calendar getFechaFab() {
        return fechaFab;
    }

    public Calendar getFechaCad() {
        return fechaCad;
    }

    public int getUnidades() {
        return unidades;
    }

    public Double getPrecio() {
        return precio;
    }

    public Receta getReceta() {
        return receta;
    }

    public ArrayList getPrincipios() {
        return principios;
    }

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

    public void setPrincipios(Principio p) {
        this.principios.add(p);
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    public void mostrarMedicamento(){
        
    }
    
     @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public boolean equals(Object o){
        
        return false;
        
    }
    
}
