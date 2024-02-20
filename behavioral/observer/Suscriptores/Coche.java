package behavioral.observer.Suscriptores;

import behavioral.observer.Semaforo;
import behavioral.observer.Suscriptores.interfaces.Observer;

public class Coche implements Observer {
   public void update(Semaforo semaforo) {
      if (semaforo.status.equals("ROJO_COCHE")) {
         System.out.println("Semaforo Rojo para Coche: -> Coche NO puede pasar");
      } else {
         System.out.println("Semaforo Verde para Coche: -> Coche SI puede pasar");
      }
   }
}
