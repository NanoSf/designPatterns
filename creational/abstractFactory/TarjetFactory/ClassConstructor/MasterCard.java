package creational.abstractFactory.TarjetFactory.ClassConstructor;

import creational.abstractFactory.TarjetFactory.interfaceFactory.Card;

public class MasterCard implements Card {
   public String getCardType() {
      return "MASTERCARD";
   }

   public String getCardNumber() {
      return "0000 0000 0000 MASTERCARD";
   }
}
