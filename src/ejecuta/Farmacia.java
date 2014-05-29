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
    
    
    
    
    };
    public void busquedaMedicamento(String nombre){
    /*Búsqueda de medicamentos: La aplicación permitirá buscar medicamentos por nombre o por 
    principios activos. El sistema mostrará toda la información de los medicamentos buscados. La 
    búsqueda tanto por nombre como por principio activo se hará por palabras similares (si el usuario 
    buscara por la palabra “ibu”, le mostraría todos los medicamentos que contengan “ibu” en el 
    nombre).
    */
        
         
        
    
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
