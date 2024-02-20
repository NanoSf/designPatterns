package behavioral.templateMethod;

public abstract class Payment {
   abstract void initialize();

   abstract void startPayment();

   abstract void endPayment();

   public final void makePayment() {
      this.initialize();
      this.startPayment();
      this.endPayment();
   }
}
