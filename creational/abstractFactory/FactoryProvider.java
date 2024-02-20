package creational.abstractFactory;

import creational.abstractFactory.PayForFactory.PaymentMethodFactory;
import creational.abstractFactory.TarjetFactory.CardFactory;

public class FactoryProvider {
   public static AbstarctFactory getFactory(String chooseFactory) {
      if ("Card".equals(chooseFactory)) {
         return new CardFactory();
      } else {
         return "PaymentMehtod".equals(chooseFactory) ? new PaymentMethodFactory() : null;
      }
   }
}
