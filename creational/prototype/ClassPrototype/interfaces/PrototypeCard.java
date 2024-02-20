package creational.prototype.ClassPrototype.interfaces;

public interface PrototypeCard {
   void getCard();

   PrototypeCard clone() throws CloneNotSupportedException;
}
