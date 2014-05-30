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
    private int caduca=5;
    private ArrayList medicamentos=new ArrayList<Medicamento>();
    public void altaMedicamento(){
    /*Alta de medicamentos: La aplicación permitirá dar de alta medicamentos al sistema. El usuario 
    tendrá que indicar toda la información del medicamento (incluyendo sus principios activos) y el 
    número de unidades fabricadas. Si el medicamento que se intenta dar de alta ya existiera en el 
    sistema solamente se actualizará el número de unidades y el precio de las mismas (si se modificara el 
    precio de venta todas las unidades de dicho medicamento pasarían a tener el mismo precio). Hay 
    que tener en cuenta que las fechas de caducidad y fabricación serán distintas, por lo tanto puede 
    que haya varios lotes de un medicamento con distintas fechas de fabricación y caducidad, pero 
    todas tendrán el mismo precio. Las unidades totales de ese medicamento será la suma de las 
    unidades de cada lote.
     * 
     */
     Scanner teclado=new Scanner(System.in);             
     GregorianCalendar gc=new GregorianCalendar();
     gc.getTime();
     System.out.print("Introduzca el nombre del medicamento: ");
     String aux=teclado.nextLine();
     if(medicamentos.contains(aux)){
         System.out.println("Medicamento ya existente actualice unidades y precio");
         Medicamento aux2=(Medicamento)medicamentos.get(medicamentos.indexOf(aux));
         System.out.print("Desea Actualizar el Precio Y/N:");
         if(teclado.nextLine().equals("Y")){
         System.out.print("Introduzca el nuevo precio del medicamento: ");
         aux2.setPrecio(teclado.nextDouble());
         teclado.nextLine();
         }
         Lote l=new Lote();
         l.setFechaFab(gc);
         gc.add(Calendar.DATE, caduca);
         l.setFechaCad(gc);
         aux2.setLotes(l);
         medicamentos.set(medicamentos.indexOf(aux), aux2);
     }
     else{
         Medicamento m=new Medicamento();
         Lote l=new Lote();
         m.setNombre(aux);
         l.setFechaFab(gc);
         System.out.println(gc.get(gc.DATE)+"/"+(gc.get(gc.MONTH)+1));
         gc.add(Calendar.DATE, caduca);
         System.out.println(gc.get(gc.DATE)+"/"+(gc.get(gc.MONTH)+1));
         l.setFechaCad(gc);
         m.setLotes(l);
         System.out.print("Introduzca el precio del medicamento: ");
         m.setPrecio(teclado.nextDouble());
         teclado.nextLine();
         System.out.print("Introduzca si tiene receta o no Y/N:");  
         m.setReceta(teclado.nextLine());
                //EMPEZAMOS CON LOS PRINCIPIOS
                Principio p=new Principio();
                p.setNombre("vacio");
                while(!p.getNombre().equals("Q")){
                    p=new Principio();
                    System.out.print("Introduzca el nombre del principio:");
                    p.setNombre(teclado.nextLine());
                    System.out.print("Introduzca el numero de miligramos: ");
                    p.setMiligramos(teclado.nextDouble());
                    teclado.nextLine();
                    m.setPrincipios(p);
               }
               medicamentos.add(m);
     }
    
    
    };
    public void busquedaMedicamento(String nombre){
    /*Búsqueda de medicamentos: La aplicación permitirá buscar medicamentos por nombre o por 
    principios activos. El sistema mostrará toda la información de los medicamentos buscados. La 
    búsqueda tanto por nombre como por principio activo se hará por palabras similares (si el usuario 
    buscara por la palabra “ibu”, le mostraría todos los medicamentos que contengan “ibu” en el 
    nombre).
    */
        
        for (int i = 0; i < medicamentos.size(); i++) {
        Medicamento m=(Medicamento)medicamentos.get(i);
        if(m.getNombre().contains(nombre))m.mostrarMedicamento();
        
        }
        
         
        
    
    };
    public void ventaMedicamento(String nombre){
    /*Venta de medicamentos: La aplicación permitirá vender una serie de medicamentos. Para la venta 
    se podrá realizar una búsqueda por nombre (por palabras similares) o por principio activo (por 
    palabras similares) y en caso de existir el medicamento se preguntará por el número de unidades a 
    vender. Si hay stock suficiente se realizará la venta indicando el coste total de las mismas. Para los 
    medicamentos con receta se le pedirá al usuario una confirmación adicional. El sistema venderá al 
    usuario las unidades que vayan a caducar antes.
    */ 
        
    
    
    
    };
    public void borrarMedicamento(String nombre){
    /*Borrado de medicamentos: La aplicación permitirá borrar una serie de medicamentos por nombre 
    (por palabras similares). 
    */
    
    
    
    };
        
    
}
