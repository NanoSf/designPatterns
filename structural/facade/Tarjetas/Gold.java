package structural.facade.Tarjetas;

import structural.facade.Tarjetas.interfaces.Credit;

public class Gold implements Credit {
   public void showCredit() {
      System.out.println("La tarjeta Gold tiene un Credito de 5.000");
   }
}
