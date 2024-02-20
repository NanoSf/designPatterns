package creational.abstractFactory.PayForFactory.ClassConstructor;

import creational.abstractFactory.PayForFactory.interfaceFactory.PaymentMethod;

public class Credit implements PaymentMethod {
   public String doPay() {
      return "Pago a debito";
   }

   public String doMenssaje() {
      return "Gracias por pagar con tu tarjeta credito";
   }
}
