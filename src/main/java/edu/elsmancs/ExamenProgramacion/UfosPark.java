package edu.elsmancs.ExamenProgramacion;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {
    private final double fee = 500.0;
    private final Map<String, String> flota = new HashMap<>();
    
    UfosPark() {}
    
    void add(String ufo) {
        this.flota.putIfAbsent(ufo, null);
    }
    
    
    
    @Override
    public void dispatch(CreditCard credit) {   
        for (String ufo : flota.keySet()) {
            if (this.flota.get(ufo) == null) {
                if (!flota.containsValue(credit)){
                    if (credit.pay(fee)){
                        flota.put(ufo, credit);
                        break;
                    }
                }
            }
        }
    }
    
    String getUfoOf(String owner){
        String ufoID = null;
        if (flota.containsValue(owner)) {
            for (Map.Entry<String, String> entry: flota.entrySet()) {
                if (entry.getValue().equals(owner)) {
                    ufoID = entry.getKey();
                    break;
                }
            }
        }
        return ufoID;
    } 
    
    @Override
    public String toString() {
        return this.flota.keySet().toString();
    }
}
