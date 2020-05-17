/**
 * RickMenuDispatcher
 * ==============
 * Servicio de venta de producto RickMenu
 * para los invitados a la fiesta.
 */
package edu.elsmancs.ExamenProgramacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DanyZurita
 * 
 */

public class RickMenuDispatcher implements GuestDispatcher{
   private int stock = 100;
   private double menuCost = 10.0;
   private final List<String> orders = new ArrayList<>();
   
   /**
     * Contructor RickMenuDispatcher
     * 
     * Constructor vacio para que 
     * se utilice el constructor por
     * defecto de la clase.
     */
   RickMenuDispatcher() {};
   
   /**
     * Despachar
     * 
     * Para despachar un item deben de cumplir
     * 2 condiciones:
     * 
     * - Que el stock del item sea mayor que 0.
     * 
     * - Que el cliente pueda permitirse pagar el itemCost.
     * 
     * De ser así, se cobra y el stock del producto baja en 1
     * y se añade el nombre del owner a la coleccion orders.
     * 
     * @return void
     */
   @Override
    public void dispatch(CreditCard credit) {
        if (stock > 0 && credit.pay(menuCost)) {
            stock -= 1;
            orders.add(credit.owner());
        }
    }
    
    /**
     * toString
     * 
     * Representación del stock y su coste.
     * 
     * @return String Stock de items y la coleccion orders.
     */
    @Override
    public String toString() {
        return "Stock = " + stock + "\n"
                + "Orders = " + orders.toString();
    }
}
