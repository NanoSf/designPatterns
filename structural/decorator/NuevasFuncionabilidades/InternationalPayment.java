package structural.decorator.NuevasFuncionabilidades;

import structural.decorator.CreditDecorator;
import structural.decorator.ClasesIniciales.Credit;

public class InternationalPayment extends CreditDecorator {
   public InternationalPayment(Credit decoratedCredit) {
      super(decoratedCredit);
   }

   public void showCredit() {
      this.decoratedCredit.showCredit();
      this.configInternationalPayment();
   }

   private void configInternationalPayment() {
      System.out.println("La tarjeta ha sido configurada para hacer pagos internacionales");
   }
}
