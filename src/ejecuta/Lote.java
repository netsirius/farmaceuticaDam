/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

import java.io.Serializable;
import java.util.Calendar;
import java.util.*;
/**
 *
 * @author DAM
 */
public class Lote implements Serializable{
    private Calendar fechaFab,fechaCad;
    private int unidades;
    public boolean caduca(){
        GregorianCalendar fecha1=new GregorianCalendar();
        fecha1.setTime(new Date());
        // Comparo las fechas y despliego el resultado 
        switch (fechaCad.compareTo(fecha1)){ 
        case 1: 
        return false;
        case 0: 
        return true;
        case -1: 
        return true;
        } 
        return false;

    }
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getUnidades() {
        return unidades;
    }
    
    public String getFechaFab() {
        return (fechaFab.get(fechaFab.DATE)+"/"+(fechaFab.get(fechaFab.MONTH)+1)+"/"+(fechaFab.get(fechaFab.YEAR)));
    }

    public String getFechaCad() {
        return (fechaCad.get(fechaCad.DATE)+"/"+(fechaCad.get(fechaCad.MONTH)+1)+"/"+(fechaFab.get(fechaFab.YEAR)));
    }

    public void setFechaFab(Calendar fechaFab) {
        this.fechaFab = fechaFab;
    }

    public void setFechaCad(Calendar fechaCad) {
        this.fechaCad = fechaCad;
    }
}
