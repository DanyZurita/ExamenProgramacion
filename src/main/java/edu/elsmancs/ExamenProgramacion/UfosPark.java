package edu.elsmancs.ExamenProgramacion;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {
    private double fee;
    public Map<String, String> flota = new HashMap<String, String>();
    
    public UfosPark() {}
    
    public void add(String ufo) {
        this.flota.putIfAbsent(ufo, "libre");
    }
    
    void dispatch(CreditCard cc) {
        cc.pay(fee);
        for (String ovni : flota.keySet()) {
            if (flota.get(ovni).equals("libre")) {
                flota.put(ovni, cc.number());
                break;
            }
        }
        
    }
}
