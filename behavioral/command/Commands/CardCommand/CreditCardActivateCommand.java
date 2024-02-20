package behavioral.command.Commands.CardCommand;

import behavioral.command.Commands.CreditCard;
import behavioral.command.Commands.CardCommand.interfaces.Command;

public class CreditCardActivateCommand implements Command {
   CreditCard creditCard;

   public CreditCardActivateCommand(CreditCard creditCard) {
      this.creditCard = creditCard;
   }

   public void execute() {
      this.creditCard.sendPinNumberToCustomer();
      this.creditCard.activate();
      this.creditCard.sendSMSToCustomerActivate();
   }
}
