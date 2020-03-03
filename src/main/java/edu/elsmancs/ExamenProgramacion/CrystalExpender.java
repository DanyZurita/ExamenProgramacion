package edu.elsmancs.ExamenProgramacion;

public class CrystalExpender implements GuestDispatcher {
    private int stock = 0;
    private double itemCost = 0.0;
    
    CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }
    
    @Override
    public void dispatch(CreditCard credit) {
        if (0 <= stock && credit.pay(itemCost)) {
                this.stock -= 1;
        }  
    }
    
    @Override
    public String toString() {
        return "Stock: " + stock() + '\n'
                + "Cost: " + this.itemCost + '\n';
    }
    
    int stock() {
        return this.stock;
    }
}
