package behavioral.observer.ManagerSusciptor;

import behavioral.observer.Semaforo;
import behavioral.observer.Suscriptores.interfaces.Observer;

public interface Subject {
   void attach(Observer var1);

   void dettach(Observer var1);

   void notifyUpdate(Semaforo var1);
}
