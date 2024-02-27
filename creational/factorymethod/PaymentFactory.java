package creational.factorymethod;

import creational.factorymethod.ClassTypePayment.CardPayment;
import creational.factorymethod.ClassTypePayment.GooglePayment;
import creational.factorymethod.ClassTypePayment.interfaces.Payment;
import creational.factorymethod.enums.TypePayment;


public class PaymentFactory {
   public static Payment buildPayment(TypePayment typePayment) {
      switch(typePayment) {
      case GOOGLEPAY:
         return new GooglePayment();
      default:
         return new CardPayment();
      }
   }
}
