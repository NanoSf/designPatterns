package creational.builder;

public class Card {
   private final String cardType;
   private final String number;
   private final String name;
   private final int expires;
   private final boolean credit;

   Card(CardCardBuilder builder) {
      this.cardType = builder.cardType;
      this.number = builder.number;
      this.name = builder.name;
      this.expires = builder.expires;
      this.credit = builder.credit;
   }

   public String toString() {
      return "Card: " + this.cardType + " " + this.number + " " + this.expires + " " + this.name + " " + this.credit;
   }

   public String getCardType() {
      return this.cardType;
   }

   public String getNumber() {
      return this.number;
   }

   public String getName() {
      return this.name;
   }

   public int getExpires() {
      return this.expires;
   }

   public boolean isCredit() {
      return this.credit;
   }
}
