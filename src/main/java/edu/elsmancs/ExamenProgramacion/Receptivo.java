package edu.elsmancs.ExamenProgramacion;

import java.util.ArrayList;


public class Receptivo {
    
    private ArrayList<GuestDispatcher> servicios = new ArrayList<>();
    
    public Receptivo() {}
    
    void registra(GuestDispatcher dispatch) {
        servicios.add(dispatch);
    }
}
