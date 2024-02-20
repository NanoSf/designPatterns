package structural.bridge.creditCard;

import structural.bridge.creditCard.interfaces.ICreditCard;

public class UnsecureCreditCard implements ICreditCard {
   public void realizarPago() {
      System.out.println("Pago realizado SIN SEGURIDAD");
   }
}
