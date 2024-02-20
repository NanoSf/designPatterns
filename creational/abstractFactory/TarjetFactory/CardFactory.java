package creational.abstractFactory.TarjetFactory;

import creational.abstractFactory.AbstarctFactory;
import creational.abstractFactory.TarjetFactory.ClassConstructor.MasterCard;
import creational.abstractFactory.TarjetFactory.ClassConstructor.Visa;
import creational.abstractFactory.TarjetFactory.interfaceFactory.Card;

public class CardFactory implements AbstarctFactory<Card> {
   public Card create(String type) {
      if ("VISA".equals(type)) {
         return new Visa();
      } else {
         return "MASTERCARD".equals(type) ? new MasterCard() : null;
      }
   }
}
