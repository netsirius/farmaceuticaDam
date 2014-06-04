/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

import java.util.Calendar;

/**
 *
 * @author DAM
 */
public class Lote {
    private Calendar fechaFab,fechaCad;
    private int unidades;

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
