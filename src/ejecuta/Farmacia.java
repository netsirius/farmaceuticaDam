/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

import ejecuta.Medicamento.Receta;
import java.util.*;

/**
 *
 * @author DAM
 */
public class Farmacia {
    Scanner teclado=new Scanner(System.in);  
    private int caduca=5;
    private ArrayList medicamentos=new ArrayList<Medicamento>();

    public ArrayList getMedicamentos() {
        return medicamentos;
    }
    public void caducidad(){
        for (int i = 0; i < medicamentos.size(); i++) {
            Medicamento m=(Medicamento)medicamentos.get(i);
            ArrayList al=m.getLotes();
            ArrayList aux=new ArrayList();
            for (int j = 0; j < al.size(); j++) {
                Lote l=(Lote)al.get(i);
                if(l.caduca())aux.add(j);
            }
            for (int j = 0; j< aux.size(); j++) {
            al.remove(((int)aux.get(j)-i));
            }
            m.setLotes(al);
        }
    }
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
                
     GregorianCalendar gc=new GregorianCalendar();
     GregorianCalendar gc2=new GregorianCalendar();
     gc.setTime(new Date());
     gc2.setTime(new Date());
     System.out.print("Introduzca el nombre del medicamento: ");
     String aux=teclado.nextLine();
     Medicamento n=new Medicamento();
     n.setNombre(aux);
     if(medicamentos.contains(n)){
         System.out.println("Medicamento ya existente actualice unidades y precio");
         Medicamento aux2=new Medicamento();
         aux2=(Medicamento)medicamentos.get(medicamentos.indexOf(n));
         System.out.print("Desea Actualizar el Precio Y/N:");
         if(teclado.nextLine().equals("Y")){
         System.out.print("Introduzca el nuevo precio del medicamento: ");
         aux2.setPrecio(teclado.nextDouble());
         teclado.nextLine();
         }
         Lote l=new Lote();
         l.setFechaFab(gc);
         gc2.add(Calendar.DATE, caduca);
         l.setFechaCad(gc2);
         System.out.print("Introduzca las unidades nuevas del medicamento: ");
         l.setUnidades(teclado.nextInt());
         teclado.nextLine();
         aux2.setLote(l);
         aux2.setUnidadesTotales(l.getUnidades());
         medicamentos.set(medicamentos.indexOf(n), aux2);
     }
     else{
         Medicamento m=new Medicamento();
         Lote l=new Lote();
         m.setNombre(aux);
         l.setFechaFab(gc);
         gc2.add(Calendar.DATE, caduca);
         l.setFechaCad(gc2);
         System.out.print("Introduzca las unidades del medicamento: ");
         l.setUnidades(teclado.nextInt());
         teclado.nextLine();
         m.setUnidadesTotales(l.getUnidades());
         m.setLote(l);
         System.out.print("Introduzca el precio del medicamento: ");
         m.setPrecio(teclado.nextDouble());
         teclado.nextLine();
         System.out.print("Introduzca si tiene receta o no Y/N:");  
         m.setReceta(teclado.nextLine());
                //EMPEZAMOS CON LOS PRINCIPIOS
                Principio p=new Principio();
                String leer="";
                while(!leer.equals("Q")){
                    p=new Principio();
                    System.out.print("Introduzca el nombre del principio (PARA SALIR PULSE Q):");
                    leer=teclado.nextLine();
                    if(!leer.equals("Q")){
                    p.setNombre(leer);
                    System.out.print("Introduzca el numero de miligramos: ");
                    p.setMiligramos(teclado.nextDouble());
                    teclado.nextLine();
                    m.setPrincipios(p);
                    }
               }
               
               medicamentos.add(m);
     }
    
    
    };
    public ArrayList<Medicamento> busquedaMedicamento(String nombre){
    /*Búsqueda de medicamentos: La aplicación permitirá buscar medicamentos por nombre o por 
    principios activos. El sistema mostrará toda la información de los medicamentos buscados. La 
    búsqueda tanto por nombre como por principio activo se hará por palabras similares (si el usuario 
    buscara por la palabra “ibu”, le mostraría todos los medicamentos que contengan “ibu” en el 
    nombre).
    */ 
        System.out.println("0-Por medicamento");
        System.out.println("1-Por principio");
        int aux=teclado.nextInt();
        ArrayList encontrados=new ArrayList<Medicamento>();
        if(aux==0){
            for (int i = 0; i < medicamentos.size(); i++) {
                Medicamento m=(Medicamento)medicamentos.get(i);
                if(m.getNombre().contains(nombre)){
                    System.out.println("SELECCION. "+(i+1)+"-");
                    m.mostrarMedicamento();
                    System.out.println();
                    encontrados.add(m);
                }
        
        }
        }
        else{
            for (int i = 0; i < medicamentos.size(); i++) {
                Medicamento m=(Medicamento)medicamentos.get(i);
                for (int j = 0; j < m.getLotes().size(); j++) {
                    Principio p=(Principio)m.getLotes().get(j);
                    if(p.getNombre().contains(nombre)){
                    m.mostrarMedicamento();
                    encontrados.add(m);
                 }
                }
                
        
        }
        }
         
        
    return encontrados;
    };
    public double ventaMedicamento(String nombre){ 
    /*Venta de medicamentos: La aplicación permitirá vender una serie de medicamentos. Para la venta 
    se podrá realizar una búsqueda por nombre (por palabras similares) o por principio activo (por 
    palabras similares) y en caso de existir el medicamento se preguntará por el número de unidades a 
    vender. Si hay stock suficiente se realizará la venta indicando el coste total de las mismas. Para los 
    medicamentos con receta se le pedirá al usuario una confirmación adicional. El sistema venderá al 
    usuario las unidades que vayan a caducar antes.
    */ 
        
        ArrayList al=new ArrayList<Medicamento>();
        al=this.busquedaMedicamento(nombre);
        double precioTotal=0;
        if(al.size()==1){      
           Medicamento m=(Medicamento)al.get(0);
           if(m.getReceta()==Receta.CONRECETA){
               System.out.println();
               System.out.println();
               System.out.println("PARA LA VENTA DE ESTE MEDICAMENTO SE DEBE ^RESENTAR RECETA MEDICA!!!!!");
               System.out.println();
               System.out.println();
           }
           System.out.print("Seleccione cuantas unidades desea: "); 
           int aux=teclado.nextInt();
           teclado.nextLine();
           if(aux<m.getUnidadesTotales()){
               int aux2=0,i=0;
               ArrayList al2=m.getLotes();
               while(aux2<=aux){
                   Lote l=(Lote)al2.get(i);
                   aux2+=l.getUnidades();
                   i++;
               }
               aux2=0;
               for (int j = 0; j < (i-1); j++) {
                   aux2+=m.restarLote(-1);
               }
               if(aux2<aux){
                   m.restarLote(aux-aux2);
               }
               m.setUnidadesTotales(-aux);
               System.out.println();
               System.out.println();
               System.out.println("ACTUALIZACION:-----------");
               m.mostrarMedicamento();          
               System.out.println();
               System.out.println();
               System.out.println("PRECIO TOTAL: ------------ "+(m.getPrecio()*aux));
               return (m.getPrecio()*aux);
              
           }
           else{
               System.out.println("No hay suficientes existencias");
           }
        }else{
           System.out.print("Seleccione uno de los anteriores,introduzca el numero de seleccion: "); 
           int aux=teclado.nextInt();
           teclado.nextLine();
           while(aux<1 || aux>al.size()){
              System.out.print("Seleccione uno de los anteriores,introduzca el numero de seleccion: "); 
              aux=teclado.nextInt();
              teclado.nextLine();
           }
           Medicamento m=(Medicamento)al.get(aux-1);
           m.mostrarMedicamento();
           if(m.getReceta()==Receta.CONRECETA){
               System.out.println();
               System.out.println();
               System.out.println("PARA LA VENTA DE ESTE MEDICAMENTO SE DEBE ^RESENTAR RECETA MEDICA!!!!!");
               System.out.println();
               System.out.println();
           }
           
           System.out.print("Seleccione cuantas unidades desea: "); 
           aux=teclado.nextInt();
           teclado.nextLine();
           if(aux<=m.getUnidadesTotales()){
               int aux2=0,i=0;
               ArrayList al2=m.getLotes();
               while(aux2<=aux){
                   Lote l=(Lote)al2.get(i);
                   aux2+=l.getUnidades();
                   i++;
               }
               aux2=0;
               for (int j = 0; j < (i-1); j++) {
                   aux2+=m.restarLote(-1);
               }
               if(aux2<aux){
                   m.restarLote(aux-aux2);
               }
              m.setUnidadesTotales(-aux);
               System.out.println();
               System.out.println();
               System.out.println("ACTUALIZACION:-----------");
               m.mostrarMedicamento();          
               System.out.println();
               System.out.println();
               System.out.println("PRECIO TOTAL: ------------ "+(m.getPrecio()*aux));
               return (m.getPrecio()*aux);
               
           }
           else{
               System.out.println("No hay suficientes existencias");
           }
           
        }
        
    
        return -1;
    };
    public void borrarMedicamento(String nombre){
    /*Borrado de medicamentos: La aplicación permitirá borrar una serie de medicamentos por nombre 
    (por palabras similares). 
    */
    ArrayList aux=new ArrayList();
    for (int i = 0; i <medicamentos.size(); i++) {
        Medicamento m=(Medicamento)medicamentos.get(i);
        if(m.getNombre().contains(nombre))aux.add(i);
    }
        for (int i = 0; i < aux.size(); i++) {
            medicamentos.remove(((int)aux.get(i)-i));
        }
    
    };
        
    
}
