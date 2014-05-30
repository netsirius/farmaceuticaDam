
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

/**
 *
 * @author DAM
 */
public class Ejecuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Farmacia f=new Farmacia();
        f.altaMedicamento();
        Medicamento m=(Medicamento)f.getMedicamentos().get(0);
        Lote l=(Lote)m.getLotes().get(0);
        System.out.println(l.getFechaCad());
        f.busquedaMedicamento("ibu");
        f.altaMedicamento();
    }
}
