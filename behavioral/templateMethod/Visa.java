package behavioral.templateMethod;

public class Visa extends Payment {
   void initialize() {
      System.out.println("Inicializando el pago con VISA....");
   }

   void startPayment() {
      System.out.println("Realizando el pago con VISA....");
   }

   void endPayment() {
      System.out.println("Finalizado el pago a traves de los servidores de VISA....");
   }
}
