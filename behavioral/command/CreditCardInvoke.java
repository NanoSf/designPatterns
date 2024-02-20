package behavioral.command;

import behavioral.command.Commands.CardCommand.interfaces.Command;

public class CreditCardInvoke {
   private Command command;

   public void setCommand(Command command) {
      this.command = command;
   }

   public void run() {
      this.command.execute();
   }
}
