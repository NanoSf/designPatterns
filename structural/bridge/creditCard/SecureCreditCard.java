package structural.bridge.creditCard;

import structural.bridge.creditCard.interfaces.ICreditCard;

public class SecureCreditCard implements ICreditCard {
   public void realizarPago() {
      System.out.println("Pago realizado CON SEGURIDAD");
   }
}
