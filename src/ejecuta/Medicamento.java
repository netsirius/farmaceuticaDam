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
    private Double precio;
    private Receta receta;
    private ArrayList lotes=new ArrayList<Lote>();
    private ArrayList principios=new ArrayList<Principio>();

    public String getNombre() {
        return nombre;
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

    public void setLotes(Lote l) {
         this.lotes.add(l);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
