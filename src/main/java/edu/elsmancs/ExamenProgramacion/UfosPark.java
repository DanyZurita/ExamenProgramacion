package edu.elsmancs.ExamenProgramacion;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {
    private final double fee = 500.0;
    public Map<String, String> flota = new HashMap<String, String>();
    
    public UfosPark() {}
    
    public void add(String ufo) {
        this.flota.putIfAbsent(ufo, null);
    }
    
    
    
    @Override
    public void dispatch(CreditCard credit) {   
    for (String ufo : flota.keySet()) {
        if (this.flota.get(ufo) == null) {
            credit.pay(fee);
            this.flota.compute(ufo, (k,v) -> v = credit.number());
            break;
            }
        }
    }
    
    String getUfoOf(String owner){
        for (String ufo : flota.keySet()) {
            if (flota.get(ufo).equals(owner)){
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
