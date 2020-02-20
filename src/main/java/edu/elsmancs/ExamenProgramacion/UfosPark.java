package edu.elsmancs.ExamenProgramacion;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {
    private double fee;
    public Map<String, String> flota = new HashMap<String, String>();
    
    public UfosPark() {}
    
    public void add(String ufo) {
        this.flota.putIfAbsent(ufo, ufo);
    }
    
    void dispatch(CreditCard cc) {
        cc.pay(fee);
        for (String ufo : flota.keySet()) {
            if (flota.get(ufo).equals(ufo)) {
                flota.put(cc.number(), ufo);
                break;
            }
        }
        
    }
    
    String getUfoOf(String owner) {
        return flota.get(owner);
            
    } 
    
}
