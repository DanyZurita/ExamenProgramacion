package edu.elsmancs.ExamenProgramacion;

public class CrystalExpender implements GuestDispatcher {
    private int stock = 0;
    private double itemCost = 0.0;
    
    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }
    
    @Override
    public void dispatch(CreditCard cc) {
        if (0 <= stock) {
            if (cc.pay(itemCost)) {
                this.stock -= 1;
            }
        }
        
    }
    
    @Override
    public String toString() {
        return "Stock: " + this.stock + '\n'
                + "Cost: " + this.itemCost + '\n';
    }
    
    int stock() {
        return this.stock;
    }
}
