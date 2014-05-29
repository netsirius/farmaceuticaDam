/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

import java.util.*;

/**
 *
 * @author DAM
 */
public class Farmacia {
    private ArrayList medicamentos=new ArrayList<Medicamento>();
    public interface FarmaciaPrototipos{
        public void altaMedicamento();
        public void busquedaMedicamento(String nombre);
        public void ventaMedicamento(String nombre);
        public void borrarMedicamento(String nombre);
        
    }
}
