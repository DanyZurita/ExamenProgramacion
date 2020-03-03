package edu.elsmancs.ExamenProgramacion;

import java.util.LinkedHashSet;
import java.util.Set;


public class Receptivo {
    
    private Set<GuestDispatcher> observers = new LinkedHashSet<>();
    
    public Receptivo() {}
    
    void registra(GuestDispatcher dispatch) {
        observers.add(dispatch);
    }
    
    void dispatch(CreditCard credit) {
        for (GuestDispatcher dispatch : observers) {
            dispatch.dispatch(credit);
        }
    }
}
