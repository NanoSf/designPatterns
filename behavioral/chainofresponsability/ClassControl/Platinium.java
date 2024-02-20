package behavioral.chainofresponsability.ClassControl;

import behavioral.chainofresponsability.ApproveLoanChain;

public class Platinium implements ApproveLoanChain {
   private ApproveLoanChain next;

   public void setNext(ApproveLoanChain loan) {
      this.next = loan;
   }

   public ApproveLoanChain getNext() {
      return this.next;
   }

   public void credidCardRequest(int totalLoan) {
      if (totalLoan > 10000 && totalLoan <= 50000) {
         System.out.println("Generando tarjeta Platinium");
      } else {
         this.next.credidCardRequest(totalLoan);
      }
   }
}
