package edu.elsmancs.ExamenProgramacion;

import java.util.ArrayList;

public class UfosPark {
    private double fee;
    public ArrayList<String> flota;
    
    public UfosPark() {}
    
    public void add(String ufo) {
        this.flota.add(ufo);
    }
}
