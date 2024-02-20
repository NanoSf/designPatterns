package behavioral.chainofresponsability;

import behavioral.chainofresponsability.ClassControl.Black;
import behavioral.chainofresponsability.ClassControl.Gold;
import behavioral.chainofresponsability.ClassControl.Platinium;

public class Tarjeta implements ApproveLoanChain {
   private ApproveLoanChain next;

   public void setNext(ApproveLoanChain loan) {
      this.next = loan;
   }

   public ApproveLoanChain getNext() {
      return this.next;
   }

   public void credidCardRequest(int totalLoan) {
      Gold gold = new Gold();
      this.setNext(gold);
      Platinium platinium = new Platinium();
      gold.setNext(platinium);
      Black black = new Black();
      platinium.setNext(black);
      if (totalLoan < 10000) {
         System.out.println("No puedes generar tu tarjeta aun");
      } else {
         this.next.credidCardRequest(totalLoan);
      }

   }
}
