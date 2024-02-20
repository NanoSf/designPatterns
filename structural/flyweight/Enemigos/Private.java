package structural.flyweight.Enemigos;

import structural.flyweight.Enemigos.interfaces.Enemy;

public class Private implements Enemy {
   private String weapon;
   private final String LIFE = "200";

   public void setWeapont(String weapont) {
      this.weapon = weapont;
   }

   public void lifePoints() {
      System.out.println("La vida de un soldado son: " + this.LIFE + " y tiene una: " + this.weapon);
   }
}
