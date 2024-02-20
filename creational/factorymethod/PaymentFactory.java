package creational.factorymethod;

import creational.factorymethod.ClassTypePayment.CardPayment;
import creational.factorymethod.ClassTypePayment.GooglePayment;

import static creational.factorymethod.PaymentFactory1.SwitchMapcreationalfactorymethodTypePayment;


public class PaymentFactory {
   public static Payment buildPayment(TypePayment typePayment) {
      switch(SwitchMapcreationalfactorymethodTypePayment[typePayment.ordinal()]) {
      case 1:
         return new GooglePayment();
      default:
         return new CardPayment();
      }
   }
}
