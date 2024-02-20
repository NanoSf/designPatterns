package structural.bridge.creditCardAdapter;

import structural.bridge.creditCard.interfaces.ICreditCard;

public abstract class CreditCard {
   protected ICreditCard tarjeta;

   protected CreditCard(ICreditCard tarjeta) {
      this.tarjeta = tarjeta;
   }

   public abstract void realizarPago();
}
