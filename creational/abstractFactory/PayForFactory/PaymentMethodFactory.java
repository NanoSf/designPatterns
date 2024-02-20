package creational.abstractFactory.PayForFactory;

import creational.abstractFactory.AbstarctFactory;
import creational.abstractFactory.PayForFactory.ClassConstructor.Credit;
import creational.abstractFactory.PayForFactory.ClassConstructor.Debit;
import creational.abstractFactory.PayForFactory.interfaceFactory.PaymentMethod;

public class PaymentMethodFactory implements AbstarctFactory<PaymentMethod> {
   public PaymentMethod create(String type) {
      if ("CREDIT".equals(type)) {
         return new Credit();
      } else {
         return "DEBIT".equals(type) ? new Debit() : null;
      }
   }
}
