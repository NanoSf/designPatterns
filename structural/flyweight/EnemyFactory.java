package structural.flyweight;

import java.util.HashMap;
import structural.flyweight.Enemigos.Detective;
import structural.flyweight.Enemigos.Private;
import structural.flyweight.Enemigos.interfaces.Enemy;

public class EnemyFactory {
   private static HashMap<String, Enemy> enemigos = new HashMap();

   public static Enemy getEnemy(String type) {
      Enemy enemy = null;
      if (enemigos.containsKey(type)) {
         enemy = (Enemy)enemigos.get(type);
      } else {
         byte var3 = -1;
         switch(type.hashCode()) {
         case 140110645:
            if (type.equals("Detective")) {
               var3 = 1;
            }
            break;
         case 1350155619:
            if (type.equals("Private")) {
               var3 = 0;
            }
         }

         switch(var3) {
         case 0:
            System.out.println("Soldado ha sido creado");
            enemy = new Private();
            break;
         case 1:
            System.out.println("Detective ha sido creado");
            enemy = new Detective();
            break;
         default:
            System.out.println("No se ha creado enemigo");
         }

         enemigos.put(type, enemy);
      }

      return (Enemy)enemy;
   }
}
