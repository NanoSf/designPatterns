package creational.builder;

public class CardCardBuilder {
   String cardType;
   String number;
   String name;
   int expires;
   boolean credit;

   public CardCardBuilder(String cardType, String number) {
      this.cardType = cardType;
      this.number = number;
   }

   public CardCardBuilder name(String name) {
      this.name = name;
      return this;
   }

   public CardCardBuilder expires(int expires) {
      this.expires = expires;
      return this;
   }

   public CardCardBuilder credit(boolean credit) {
      this.credit = credit;
      return this;
   }

   public Card build() {
      return new Card(this);
   }
}
