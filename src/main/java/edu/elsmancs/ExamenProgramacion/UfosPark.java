/**
 * Ufos Park
 * ==============
 * Parking de UFOs con la lógica de
 * como deben comportarse una vez
 * que han sido despachado a un cliente.
 * 
 * Los nuevos UFOs no pueden tener el mismo nombre
 * que uno ya existente. 
 * 
 * Para despachar un UFO, primero se comprueba
 * que el cliente no haya pedido un UFO previamente
 * y se comprueba si quedan UFO disponibles y si el 
 * cliente tiene dinero (EZIs) suficiente para pagar.
 * 
 * Cada UFO solo puede ser despachado unicamente
 * a un unico cliente.
 */

package edu.elsmancs.ExamenProgramacion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DanyZurita
 * 
 */

public class UfosPark implements GuestDispatcher {
    private final double fee = 500.0;
    private final Map<String, String> flota = new HashMap<>();
    
    /**
     * Contructor UfosPark
     * 
     * Constructor vacio para que 
     * se utilice el constructor por
     * defecto de la clase.
     */
    UfosPark() {}
    
    /**
     * Añadir nuevo UFO
     * 
     * Añadir nuevo UFO a la colección flota de UFOs
     * teniendo en cuenta de que no pueden haber dos
     * con el mismo nombre. 
     * 
     * @param String con el nombre del nuevo UFO
     * @return void
     */
    void add(String ufo) {
        this.flota.putIfAbsent(ufo, null);
    }
    
    
    /**
     * Despachar
     * 
     * Para despachar un UFO se deben de cumplir
     * 3 condiciones:
     * 
     * - Que el cliente no se le haya dado previamente
     * un UFO.
     * 
     * - Que dentro de la colección de UFOs quede alguno
     * disponible (sin cliente asociado).
     * 
     * - Que el cliente tenga dinero suficiente (500 EZIs)
     * para pagar la fee.
     * 
     * Si cumple dichas condiciones se le cobrará la fee
     * y se asociará al primer conductor disponible añadiendo
     * su nombre junto con el de su conductor.
     * 
     * @param CreditCard El objeto CreditCard del cliente
     * @return void
     */
    @Override
    public void dispatch(CreditCard credit) {   
        Map.Entry<String, String> ufo = null;

        if (!flota.containsValue(credit.number())) {
            for (Map.Entry<String, String> entry : this.flota.entrySet()) {
                if (entry.getValue() == null) {
                    ufo = entry;
                    break;
                }
            }
        }
        if (ufo != null  && credit.pay(fee)) {
            this.flota.put(ufo.getKey(), credit.number());
        }
    }  
    
    /**
     * Consultar UFO de cliente
     * 
     * Con el nombre del cliente se busca dentro 
     * de la colección flota si este existe.
     * Si lo hace, se devuelve el valor de su UFO
     * asociado; si no, se devuelve null.
     * 
     * @param String Nombre del owner cliente
     * @return String Devuleve nombre del UFO o null 
     */
    String getUfoOf(String owner){
        String ufoID = null;
        if (flota.containsValue(owner)) {
            for (Map.Entry<String, String> entry: flota.entrySet()) {
                if (entry.getValue() == owner) {
                    ufoID = entry.getKey();
                    break;
                }
            }
        }
        return ufoID;
    } 
    
    /**
     * toString
     * 
     * Representación de los nombres la flota de UFOs.
     * 
     * @return String Nombres de todos los UFOs de la flota
     */
    @Override
    public String toString() {
        return this.flota.keySet().toString();
    }
}
