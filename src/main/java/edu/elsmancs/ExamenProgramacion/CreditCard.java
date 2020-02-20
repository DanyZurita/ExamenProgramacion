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
        return this.credit >= pay;
    }
    
    double credit() {
        return this.credit;
    }
    
}
