package structural.adapter.ClassAdapter;

import structural.adapter.ClasSecure.BlackCreditCard;
import structural.adapter.ClasSecure.GoldCreditCard;
import structural.adapter.ClasSecure.interfaces.Secure;
import structural.adapter.ClassAdapter.interfaces.Payment;

public class Adapter implements Payment {
   Secure secureCreditCard;

   public Adapter(String type) {
      if (type.equals("black")) {
         this.secureCreditCard = new BlackCreditCard();
      } else if (type.equals("gold")) {
         this.secureCreditCard = new GoldCreditCard();
      }

   }

   public void pay(String type) {
      if (type.equals("black")) {
         this.secureCreditCard.payWithSecureLevelA();
      } else if (type.equals("gold")) {
         this.secureCreditCard.payWithSecureLevelZ();
      }

   }
}
