package behavioral.command.Commands.CardCommand;

import behavioral.command.Commands.CreditCard;
import behavioral.command.Commands.CardCommand.interfaces.Command;

public class CreditCardDesactivateCommand implements Command {
   CreditCard creditCard;

   public CreditCardDesactivateCommand(CreditCard creditCard) {
      this.creditCard = creditCard;
   }

   public void execute() {
      this.creditCard.desactivate();
      this.creditCard.sendSMSToCustomerDesactivate();
   }
}
