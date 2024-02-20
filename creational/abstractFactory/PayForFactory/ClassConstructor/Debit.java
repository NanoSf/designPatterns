package creational.abstractFactory.PayForFactory.ClassConstructor;

import creational.abstractFactory.PayForFactory.interfaceFactory.PaymentMethod;

public class Debit implements PaymentMethod {
   public String doPay() {
      return "Pago a credito";
   }

   public String doMenssaje() {
      return "Hola, gracias por pagar con tu tarjeta debito";
   }
}
