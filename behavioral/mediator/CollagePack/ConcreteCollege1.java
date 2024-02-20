package behavioral.mediator.ColleagePack;

import behavioral.mediator.Mediator;

public class ConcreteCollege1 extends Colleage {
   public ConcreteCollege1(Mediator mediator) {
      super(mediator);
   }

   public void send(String mensaje) {
      this.mediator.send(mensaje, this);
   }

   public void messageReceived(String mensaje) {
      System.out.println("Collega1 ha recibido el siguiente mensaje: " + mensaje);
   }
}
