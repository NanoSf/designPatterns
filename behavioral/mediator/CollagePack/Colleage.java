package behavioral.mediator.ColleagePack;

import behavioral.mediator.Mediator;

public abstract class Colleage {
   protected Mediator mediator;

   public Colleage(Mediator mediator) {
      this.mediator = mediator;
   }

   public abstract void send(String var1);

   public abstract void messageReceived(String var1);
}
