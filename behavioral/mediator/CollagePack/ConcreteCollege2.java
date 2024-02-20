package behavioral.mediator.ColleagePack;

import behavioral.mediator.Mediator;

public class ConcreteCollege2 extends Colleage {
   public ConcreteCollege2(Mediator mediator) {
      super(mediator);
   }

   public void send(String mensaje) {
      this.mediator.send(mensaje, this);
   }

   public void messageReceived(String mensaje) {
      System.out.println("Collega2 ha recibido el siguiente mensaje: " + mensaje);
   }
}
