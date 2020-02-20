package edu.elsmancs.ExamenProgramacion;

public class CrystalExpender {
    private int stock = 0;
    private double itemCost = 0.0;
    
    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }
    
    void dispatch(CreditCard cc) {
        if (0 <= stock) {
            if (cc.pay(itemCost)) {
                this.stock -= 1;
            }
        }
        
    }
    
    
}