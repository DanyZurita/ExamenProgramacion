/**
 * CrystalExpender
 * ==============
 * Proucto en venta para los invitados a la fiesta.
 * 
 * El stock es limitado y no puede ser inferior a 0.
 * 
 * El precio de cada item se establece con el stock
 * y en principio no puede ser inferior a 0.
 * 
 * Una vez se vende un producto su stock baja en 1.
 */
package edu.elsmancs.ExamenProgramacion;

/**
 *
 * @author DanyZurita
 * 
 */

public class CrystalExpender implements GuestDispatcher {
    private int stock = 0;
    private double itemCost = 0.0;
    
    /**
     * Contructor CrystalExpender
     * 
     * Construye la CrystalExpender co el stock inicial
     * y el coste de cada uno.
     * 
     * @param int Cantidad de stock.
     * @param double Precio de cada uno de los items.
     */
    CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }
    
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
     * De ser así, se cobra y el stock del producto baja en 1.
     */
    @Override
    public void dispatch(CreditCard credit) {
        if (0 < stock && credit.pay(itemCost)) {
                this.stock -= 1;
        }  
    }
    
    /**
     * toString
     * 
     * Representación del stock y su coste.
     * 
     * @return String Stock de items y su coste.
     */
    @Override
    public String toString() {
        return "Stock: " + stock() + '\n'
                + "Cost: " + this.itemCost + '\n';
    }
    
    /**
     * Getter stock
     * 
     * Devuelve el stock de los items.
     * 
     * @return int Stock de items
     */
    int stock() {
        return this.stock;
    }
}
