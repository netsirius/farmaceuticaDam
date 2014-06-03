
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

import java.util.ArrayList;

/**
 *
 * @author DAM
 */
public class Ejecuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList encontrados=new ArrayList<Medicamento>();
        Farmacia f=new Farmacia();
        f.altaMedicamento();
        f.altaMedicamento();
        //VER FECHA DE CADUCIDAD DE UN MEDICAMENTO
//        Medicamento m=(Medicamento)f.getMedicamentos().get(0);
//        Lote l=(Lote)m.getLotes().get(0);
//        System.out.println(l.getFechaCad());
        encontrados=f.busquedaMedicamento("A",0);
        f.borrarMedicamento("ABU");
        encontrados=f.busquedaMedicamento("A",0);
        int A=0;
    }
}
