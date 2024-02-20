package structural.facade.Tarjetas;

import structural.facade.Tarjetas.interfaces.Credit;

public class Silver implements Credit {
   public void showCredit() {
      System.out.println("La tarjeta Silver tiene un Credito de 200.000");
   }
}
