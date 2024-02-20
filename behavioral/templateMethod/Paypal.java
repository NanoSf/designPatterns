package behavioral.templateMethod;

public class Paypal extends Payment {
   void initialize() {
      System.out.println("Inicializando el pago con Paypal....");
   }

   void startPayment() {
      System.out.println("Realizando el pago con Paypal....");
   }

   void endPayment() {
      System.out.println("Finalizado el pago a traves de los servidores de Paypal....");
   }
}
