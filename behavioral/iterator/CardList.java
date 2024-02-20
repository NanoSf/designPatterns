package behavioral.iterator;

public class CardList implements List {
   private Card[] cards;

   public CardList(Card[] cards) {
      this.cards = cards;
   }

   public Iterator iterator() {
      return new CardIterator(this.cards);
   }
}
