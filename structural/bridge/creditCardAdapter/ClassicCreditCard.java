package structural.bridge.creditCardAdapter;

import structural.bridge.creditCard.interfaces.ICreditCard;

public class ClassicCreditCard extends CreditCard {
   public ClassicCreditCard(ICreditCard tarjeta) {
      super(tarjeta);
   }

   public void realizarPago() {
      this.tarjeta.realizarPago();
   }
}
