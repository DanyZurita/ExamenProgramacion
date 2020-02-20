package edu.elsmancs.ExamenProgramacion;

public class CreditCard {
    private final String owner;
    private final String number;
    private double credit = 3000.0;
    private String SYMBOL = "EZIS";
    
    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }
   
    boolean pay(double pay) {
        boolean payable = this.credit >= pay;
        if (payable) {
            this.credit -= pay;
        }
        return payable;
    }
    
    String number() {
        return this.number;
    }
            
    double credit() {
        return this.credit;
    }
    
    
}
