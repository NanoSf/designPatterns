package behavioral.observer.ManagerSusciptor;

import behavioral.observer.Semaforo;
import behavioral.observer.Suscriptores.interfaces.Observer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MessajePublisher implements Subject {
   private List<Observer> observers = new ArrayList();

   public void attach(Observer o) {
      this.observers.add(o);
   }

   public void dettach(Observer o) {
      this.observers.remove(o);
   }

   public void notifyUpdate(Semaforo semaforo) {
      Iterator var2 = this.observers.iterator();

      while(var2.hasNext()) {
         Observer o = (Observer)var2.next();
         o.update(semaforo);
      }

   }
}
