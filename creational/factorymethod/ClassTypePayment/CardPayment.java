package creational.factorymethod.ClassTypePayment;

import creational.factorymethod.ClassTypePayment.interfaces.Payment;

public class CardPayment implements Payment {
   public void doPayment() {
      System.out.println("Pagando con tarjeta de credito");
   }
}
