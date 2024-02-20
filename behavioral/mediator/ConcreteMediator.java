package behavioral.mediator;

import behavioral.mediator.ColleagePack.Colleage;
import behavioral.mediator.ColleagePack.ConcreteCollege1;
import behavioral.mediator.ColleagePack.ConcreteCollege2;

public class ConcreteMediator implements Mediator {
   private ConcreteCollege1 user1;
   private ConcreteCollege2 user2;

   public void setUser1(ConcreteCollege1 college1) {
      this.user1 = college1;
   }

   public void setUser2(ConcreteCollege2 college2) {
      this.user2 = college2;
   }

   public void send(String message, Colleage colleage) {
      if (colleage == this.user1) {
         this.user2.messageReceived(message);
      } else if (colleage == this.user2) {
         this.user1.messageReceived(message);
      }

   }
}
