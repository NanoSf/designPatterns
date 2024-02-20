package structural.flyweight.Enemigos;

import structural.flyweight.Enemigos.interfaces.Enemy;

public class Detective implements Enemy {
   private String weapon;
   private final String LIFE = "1000";

   public void setWeapont(String weapont) {
      this.weapon = weapont;
   }

   public void lifePoints() {
      System.out.println("La vida de un teniente es:  " + this.LIFE + " y tiene una: " + this.weapon);
   }
}
