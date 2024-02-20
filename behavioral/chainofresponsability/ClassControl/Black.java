package behavioral.chainofresponsability.ClassControl;

import behavioral.chainofresponsability.ApproveLoanChain;

public class Black implements ApproveLoanChain {
   private ApproveLoanChain next;

   public void setNext(ApproveLoanChain loan) {
      this.next = loan;
   }

   public ApproveLoanChain getNext() {
      return this.next;
   }

   public void credidCardRequest(int totalLoan) {
      if (totalLoan > 50000) {
         System.out.println("Generando tarjeta Black");
      } else {
         this.next.credidCardRequest(totalLoan);
      }
   }
}
