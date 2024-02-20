package structural.decorator.NuevasFuncionabilidades;

import structural.decorator.CreditDecorator;
import structural.decorator.ClasesIniciales.Credit;

public class SecureDecorator extends CreditDecorator {
   public SecureDecorator(Credit decoratedCredit) {
      super(decoratedCredit);
   }

   public void showCredit() {
      this.decoratedCredit.showCredit();
      this.configSecure();
   }

   private void configSecure() {
      System.out.println("La tarjeta ha sido configurada con seguridad maxima");
   }
}
