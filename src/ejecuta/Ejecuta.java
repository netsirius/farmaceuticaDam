
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
        f.altaMedicamento();
        f.busquedaMedicamento("ibu");
        f.altaMedicamento();
    }
}
