package structural.facade.Tarjetas;

import structural.facade.Tarjetas.interfaces.Credit;

public class Black implements Credit {
   public void showCredit() {
      System.out.println("La tarjeta Black tiene un Credito de 1'000.000");
   }
}
