package edu.elsmancs.ExamenProgramacion;

import java.util.ArrayList;
import java.util.List;


public class RickMenuDispatcher implements GuestDispatcher{
   private int stock = 100;
   private double menuCost = 10.0;
   private final List<String> orders = new ArrayList<>();
   
   RickMenuDispatcher() {};
   
   @Override
    public void dispatch(CreditCard credit) {
        if (stock > 0 && credit.pay(menuCost)) {
            stock -= 1;
            orders.add(credit.owner());
        }
    }
    
    @Override
    public String toString() {
        return "Stock = " + stock + "\n"
                + "Orders = " + orders.toString();
    }
}
