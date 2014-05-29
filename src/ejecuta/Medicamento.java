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
    private Double precio;
    private Receta receta;
    private ArrayList principios=new ArrayList<Principio>();
    
    
    
}
