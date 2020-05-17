/**
 * GuestDispatcher
 * ==============
 * Interface para generalizar el método dispatch()
 */
package edu.elsmancs.ExamenProgramacion;

/**
 *
 * @author DanyZurita
 * 
 */

 interface GuestDispatcher {
    
    /**
     * Despachar
     * 
     * Despachar un servicio cobrandolo a la CreditCard.
     * 
     * @param CreditCard Targeta donde se cobran los servicios.
     * @return void
     */
    void dispatch(CreditCard credit);
    
}
