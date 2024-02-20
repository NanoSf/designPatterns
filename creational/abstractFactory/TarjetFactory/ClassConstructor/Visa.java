package creational.abstractFactory.TarjetFactory.ClassConstructor;

import creational.abstractFactory.TarjetFactory.interfaceFactory.Card;

public class Visa implements Card {
   public String getCardType() {
      return "VISA";
   }

   public String getCardNumber() {
      return "0000 0000 0000 VISA";
   }
}
