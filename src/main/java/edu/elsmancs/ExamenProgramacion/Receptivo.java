package edu.elsmancs.ExamenProgramacion;

import java.util.LinkedHashSet;
import java.util.Set;


public class Receptivo {
    
    private Set<GuestDispatcher> observers = new LinkedHashSet<>();
    
    public Receptivo() {}
    
    void registra(GuestDispatcher dispatch) {
        servicios.add(dispatch);
    }
    
    void dispatch(CreditCard cc) {
        for (GuestDispatcher dispatch : servicios) {
            dispatch.dispatch(cc);
        }
    }
}
