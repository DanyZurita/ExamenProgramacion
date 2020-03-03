package edu.elsmancs.ExamenProgramacion;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {
    private final double fee = 500.0;
    public Map<String, CreditCard> flota = new HashMap<String, CreditCard>();
    
    UfosPark() {}
    
    public void add(String ufo) {
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
        for (String ufo : flota.keySet()) {
            if (flota.get(ufo) != null && flota.get(ufo).number().equals(owner)){
                return ufo;
            }
        }
        return null;
    } 
    
    @Override
    public String toString() {
        return this.flota.keySet().toString();
    }
}
