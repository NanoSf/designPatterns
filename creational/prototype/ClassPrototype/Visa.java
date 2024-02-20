package creational.prototype.ClassPrototype;

import creational.prototype.ClassPrototype.interfaces.PrototypeCard;

public class Visa implements PrototypeCard {
   private String name;

   public Visa() {
   }

   public Visa(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void getCard() {
      System.out.println("Esto es una tarjeta Visa");
   }

   public PrototypeCard clone() throws CloneNotSupportedException {
      System.out.println("Clonando tarjeta Visa....");
      return new Visa(this.name);
   }
}
