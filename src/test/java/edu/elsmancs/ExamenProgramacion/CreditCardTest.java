package edu.elsmancs.ExamenProgramacion;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CreditCardTest {
    
    
    @Test
    public void creditCreditCard() {
        CreditCard test = new CreditCard("Dany","12345");
        Assert.assertEquals(3000.0, test.credit(), 0.0);
    }
}
