package structural.facade;

import structural.facade.Tarjetas.Black;
import structural.facade.Tarjetas.Gold;
import structural.facade.Tarjetas.Silver;
import structural.facade.Tarjetas.interfaces.Credit;

public class CreditMarker {
   private Credit gold = new Gold();
   private Credit silver = new Silver();
   private Credit black = new Black();

   public void showCreditGold() {
      this.gold.showCredit();
   }

   public void showCreditSilver() {
      this.silver.showCredit();
   }

   public void showCreditBlack() {
      this.black.showCredit();
   }
}
