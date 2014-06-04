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

    public ArrayList getLotes() {
        return lotes;
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
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Receta: "+this.receta);
        System.out.println("Principios: ");
        for (int i = 0; i < principios.size(); i++) {
            Principio p=(Principio)this.principios.get(i);
            System.out.println("Nombre: "+p.getNombre()+"  Miligramos: "+p.getMiligramos());
        }
        
        System.out.println("Lotes:");
         for (int i = 0; i < lotes.size(); i++) {
            Lote p=(Lote)this.lotes.get(i);
            System.out.println("Unidades: "+p.getUnidades());
            System.out.println("Fecha caducidad: "+p.getFechaCad()+"  Fecha fabricacion: "+p.getFechaFab());
        }
        
    }
    
     @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public boolean equals(Object o){
        Medicamento m =(Medicamento) o;
        return nombre.equals(m.nombre); 
    }
    
}
