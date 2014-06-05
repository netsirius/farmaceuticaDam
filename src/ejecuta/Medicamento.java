/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

/**
 *
 * @author DAM
 */
import java.io.Serializable;
import java.util.*;
public class Medicamento implements Serializable {
    enum Receta {
    // Tipos de Medicamento.
    CONRECETA, SINRECETA;
    }
    private int unidadesTotales=0;
    private String nombre;
    private Double precio;
    private Receta receta;
    private ArrayList lotes=new ArrayList<Lote>();
    private ArrayList principios=new ArrayList<Principio>();

    public int getUnidadesTotales() {
        return unidadesTotales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setUnidadesTotales(int unidadesTotales) {
        this.unidadesTotales += unidadesTotales;
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

    public void setLote(Lote l) {
         this.lotes.add(l);
    }

    public void setLotes(ArrayList lotes) {
        this.lotes = lotes;
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

    
    public int restarLote(int unidades){
        if(unidades==-1){
            Lote l=(Lote)this.lotes.get(0);
            int aux=l.getUnidades();
            this.lotes.remove(0);
            return aux;
            
        }
        else{
            Lote l=(Lote)this.lotes.get(0);
            l.setUnidades(l.getUnidades()-unidades);
            return unidades;
        }
        
        
    }
    public void mostrarMedicamento(){
        System.out.println("NOMBRE: "+this.nombre+"         UNIDADES:"+this.unidadesTotales);
        System.out.println("--------------------------------------------");
        System.out.println("Precio: "+this.precio);
        System.out.println("Receta: "+this.receta);
        System.out.println("Principios: ");
        if(principios.size()==0){
            System.out.println("----EMPTY");
        }
        else{
        for (int i = 0; i < principios.size(); i++) {
            Principio p=(Principio)this.principios.get(i);
            System.out.println("Nombre: "+p.getNombre()+"  Miligramos: "+p.getMiligramos());
        }
        }
        
        System.out.println("Lotes:");
        if(lotes.size()==0){
            System.out.println("----EMPTY");
        }
        else{
         for (int i = 0; i < lotes.size(); i++) {
            Lote p=(Lote)this.lotes.get(i);
            System.out.println("Unidades: "+p.getUnidades());
            System.out.println("Fecha caducidad: "+p.getFechaCad()+"  Fecha fabricacion: "+p.getFechaFab());
        }
        }
    }
    
     @Override
    public boolean equals(Object o){
        Medicamento m =(Medicamento) o;
        return nombre.equals(m.nombre); 
    }
    
}
