package creational.factorymethod.ClassTypePayment;

import creational.factorymethod.ClassTypePayment.interfaces.Payment;

public class GooglePayment implements Payment {
   public void doPayment() {
      System.out.println("Pagando con Google Payment");
   }
}
