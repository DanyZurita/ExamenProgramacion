/**
 * CreditCard
 * ==============
 * Targeta de credito para cada uno de los invitados
 * a la fiesta y donde se cargan todos los gastos 
 * de productos y servicios solicitados.
 * 
 * Cada targeta es única y no puede haber más de una
 * por cliente.
 * 
 * El credito inicial es de 3000.0 (EZIs) y no pueden 
 * ser negativos (deudas).
 */

 package edu.elsmancs.ExamenProgramacion;

 /**
 *
 * @author DanyZurita
 * 
 */

public class CreditCard {
    private final String owner;
    private final String number;
    private double credit = 3000.0;
    private String SYMBOL = "EZIS";
    
    /**
     * Contructor CreditCard
     * 
     * Construye la CreditCard con el nombre del
     * cliente y el numero de su targeta. En principio,
     * no cambian en ningún momento.
     * 
     * @param String Nombre del owner de la CreditCard
     * @param String Número de la CreditCard
     */
    CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }
   
    /**
     * Pago
     * 
     * Se comprueba que la suma de dinero que corresponde
     * pagar es inferior o igual a la cantidad de créditos
     * que tiene la CreditCard.
     * Si es correcto, se paga quitando la cantidad 
     * mencionada a los créditos de la targeta y devuelve true; 
     * si no, devuelve false y no se cobra nada.
     * 
     * @param double La cantidad de dinero a pagar.
     * @return boolean True o false.
     */
    boolean pay(double pay) {
        if (this.credit >= pay) {
            this.credit -= pay;
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Getter numero
     * 
     * Devuelve el numero de la CreditCard
     * 
     * @return String Numero de la CreditCard
     */
    String number() {
        return this.number;
    }
    
    /**
     * Getter owner
     * 
     * Devuelve el nombre del owner de la CreditCard
     * 
     * @return String Nombre del owner de la CreditCard
     */
    String owner() {
        return this.owner;
    }
    
    /**
     * Getter creditos
     * 
     * Devuelve los créditos de la CreditCard
     * 
     * @return String Numero de la CreditCard
     */
    double credit() {
        return this.credit;
    }
    
    /**
     * toString
     * 
     * Representación de la CreditCard con el nombre, 
     * numero y los creditos de la misma.
     * 
     * @return String Nombre del owner, número y creditos y el symbol.
     */

    @Override
    public String toString() {
        return "owner: " + owner() + '\n'
                + "number: " + number() + '\n'
                 + "credit: " + credit() + " " + this.SYMBOL + '\n';
    }
}
