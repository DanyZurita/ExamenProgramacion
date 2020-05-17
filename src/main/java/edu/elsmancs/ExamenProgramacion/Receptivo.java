/**
 * Receptivo
 * ==============
 * Componente para automatizar el despachar
 * los servicios y productos para los invitados
 * automáticamente para no tener que hacer lo 
 * uno por uno.
 */
package edu.elsmancs.ExamenProgramacion;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author DanyZurita
 * 
 */

public class Receptivo {
    
    private Set<GuestDispatcher> observers = new LinkedHashSet<>();
    
    /**
     * Contructor Receptivo
     * 
     * Constructor vacio para que 
     * se utilice el constructor por
     * defecto de la clase.
     */
    public Receptivo() {}
    
    /**
     * Registrar
     * 
     * Añade a la coleccion observers los servicios
     * que se quiere despachar usando la interface GuestDispatcher.
     * 
     * @param GuestDispacher Servicio a despachar
     * @return void
     */
    void registra(GuestDispatcher dispatch) {
        observers.add(dispatch);
    }
    
    /**
     * Despachar
     * 
     * Recorre la coleccion observers y usa los métodos
     * dispatch() de cada uno de los servicios usando la
     * CreditCard que le llega para hacer los pagos.
     * 
     * @param CreditCard Targeta donde se cobran los servicios.
     * @return void
     */
    void dispatch(CreditCard credit) {
        for (GuestDispatcher dispatch : observers) {
            dispatch.dispatch(credit);
        }
    }
}
