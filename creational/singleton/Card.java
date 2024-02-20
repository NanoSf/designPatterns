package creational.singleton;

public class Card {
   private static Card INSTANCE;
   private String cardNumber;

   private Card() {
   }

   public static synchronized Card getINSTANCE() {
      if (INSTANCE == null) {
         INSTANCE = new Card();
      }

      return INSTANCE;
   }

   public String getCardNumber() {
      return this.cardNumber;
   }

   public void setCardNumber(String cardNumber) {
      this.cardNumber = cardNumber;
   }
}
