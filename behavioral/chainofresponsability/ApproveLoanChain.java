package behavioral.chainofresponsability;

public interface ApproveLoanChain {
   void setNext(ApproveLoanChain var1);

   ApproveLoanChain getNext();

   void credidCardRequest(int var1);
}
