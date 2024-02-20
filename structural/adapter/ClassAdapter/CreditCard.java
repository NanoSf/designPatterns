package structural.adapter.ClassAdapter;

import structural.adapter.ClassAdapter.interfaces.Payment;

public class CreditCard implements Payment {
   Adapter adapter;

   public void pay(String type) {
      if (type.equals("classic")) {
         System.out.println("Tarjeta Classic: Pagando sin ningun tipo de seguridad");
      } else if (type.equals("gold")) {
         this.adapter = new Adapter("gold");
         this.adapter.pay("gold");
      } else if (type.equals("black")) {
         this.adapter = new Adapter("black");
         this.adapter.pay("black");
      } else {
         System.out.println("No se puede hacer el pago no se reconoce esa tarjeta");
      }

   }
}
