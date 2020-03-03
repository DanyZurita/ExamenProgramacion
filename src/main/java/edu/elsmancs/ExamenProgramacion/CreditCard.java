package edu.elsmancs.ExamenProgramacion;

public class CreditCard {
    private final String owner;
    private final String number;
    private double credit = 3000.0;
    private String SYMBOL = "EZIS";
    
    CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }
   
    boolean pay(double pay) {
        if (this.credit >= pay) {
            this.credit -= pay;
            return true;
        }
        else {
            return false;
        }
    }
    
    String number() {
        return this.number;
    }
    
    String owner() {
        return this.owner;
    }
    
    double credit() {
        return this.credit;
    }
    
    @Override
    public String toString() {
        return "owner: " + owner() + '\n'
                + "number: " + number() + '\n'
                 + "credit: " + credit() + " " + this.SYMBOL + '\n';
    }
}
