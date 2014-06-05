
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

import com.teide.dam.aortiz.ioutil.OperationsIO;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author DAM
 */
public class Ejecuta {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Cartel c=new Cartel();
        OperationsIO util =new OperationsIO("datos");
        c.dibujar();
        ArrayList encontrados=new ArrayList();
        ArrayList lista=new ArrayList();            
        Farmacia f=new Farmacia();
        lista=f.getMedicamentos();
        try {
            lista=(ArrayList)util.read();
        } catch (Exception ex) {
            f.cerrarFarmacia();
        }
        f.setMedicamentos(lista);
        Scanner teclado=new Scanner(System.in);  
        int variable=-1;
        
        while(variable!=0){
        System.out.println("MENU DE LA FARMACIA");
        System.out.println("1.-Dar de alta un medicamento");
        System.out.println("2.-Borrar medicamento");
        System.out.println("3.-Buscar medicamento");
        System.out.println("4.-Vender medicamento");
        System.out.println("5.-Ver todas las existencias");
        System.out.println("0.-EXIT");
        
        System.out.print("Opcion: ");
        variable=teclado.nextInt();
        teclado.nextLine();
        
                switch (variable)  { 
            case 1 : 
                System.out.print("Introduzca el nombre del medicamento: ");
                String aux=teclado.nextLine();
                f.altaMedicamento(aux); break;
            case 2 : 
                
                System.out.print("Introduzca el medicamento que desea borrar (palabras parecidas):");
                aux=teclado.nextLine();
                f.borrarMedicamento(aux); 
                
            break;
            case 3 :
                System.out.print("Introduzca el medicamento que desea buscar (palabras parecidas):");
                aux=teclado.nextLine();
                f.busquedaMedicamento(aux); 
                break;
            case 4 : 
                System.out.print("Introduzca el medicamento que desea vender (palabras parecidas):");
                aux=teclado.nextLine();
                f.ventaMedicamento(aux); 
                break;
            case 5 :
                     if(lista.isEmpty())System.out.println("NO HAY EXISTENCIAS");
                     else{
                         System.out.println("LISTA DE MEDICAMENTOS:-------------");
                         for (int i = 0; i < lista.size(); i++) {
                         Medicamento m=(Medicamento)lista.get(i);
                         System.out.println();
                         System.out.println();
                         m.mostrarMedicamento();
                         System.out.println();
                         System.out.println("---------------------------------");
                     }
                }
                break;
            case 0 : System.out.println("HASTA LUEGO");break;
        }
        
                
        teclado=new Scanner(System.in);  
        //VER FECHA DE CADUCIDAD DE UN MEDICAMENTO
//        Medicamento m=(Medicamento)f.getMedicamentos().get(0);
//        Lote l=(Lote)m.getLotes().get(0);
//        System.out.println(l.getFechaCad());
    }
    f.cerrarFarmacia();
    }
}
