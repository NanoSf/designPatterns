package structural.decorator;

import structural.decorator.ClasesIniciales.Credit;

public class CreditDecorator implements Credit {
   protected Credit decoratedCredit;

   public CreditDecorator(Credit decoratedCredit) {
      this.decoratedCredit = decoratedCredit;
   }

   public void showCredit() {
      this.decoratedCredit.showCredit();
   }
}
