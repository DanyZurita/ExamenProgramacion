package edu.elsmancs.ExamenProgramacion;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {
    private double fee = 500.0;
    public Map<String, String> flota = new HashMap<String, String>();
    
    public UfosPark() {}
    
    public void add(String ufo) {
        this.flota.putIfAbsent(ufo, ufo);
    }
    
    boolean assigned = false;
    void dispatch(CreditCard cc) {
        if (!assigned) {
            cc.pay(fee);
            for (String ufo : flota.keySet()) {
                if (this.flota.get(ufo).equals(ufo)) {
                    this.flota.put(cc.number(), ufo);
                    assigned = true;
                    break;
                }
            }
        }
    }
    
    String getUfoOf(String owner){
        try {
            return this.flota.get(owner);
        }
        catch (Exception e) {
            return "No existe";
        }
        
            
    } 
    
}
