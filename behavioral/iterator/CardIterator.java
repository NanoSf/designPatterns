package behavioral.iterator;

public class CardIterator implements Iterator {
   private Card[] cards;
   private int position;

   public CardIterator(Card[] cards) {
      this.cards = cards;
      this.position = 0;
   }

   public Object next() {
      return this.cards[this.position++];
   }

   public boolean hasNext() {
      return this.position < this.cards.length;
   }

   public Object currentItem() {
      return this.cards[this.position];
   }
}
