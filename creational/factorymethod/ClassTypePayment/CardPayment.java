package creational.factorymethod.ClassTypePayment;

import creational.factorymethod.Payment;

public class CardPayment implements Payment {
   public void doPayment() {
      System.out.println("Pagando con tarjeta de credito");
   }
}
