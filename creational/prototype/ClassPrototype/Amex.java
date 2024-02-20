package creational.prototype.ClassPrototype;

import creational.prototype.ClassPrototype.interfaces.PrototypeCard;

public class Amex implements PrototypeCard {
   private String name;

   public Amex() {
   }

   public Amex(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void getCard() {
      System.out.println("Esto es una tarjeta Amex");
   }

   public PrototypeCard clone() throws CloneNotSupportedException {
      System.out.println("Clonando tarjeta Amex....");
      return new Amex(this.name);
   }
}
