package structural.adapter.ClasSecure;

import structural.adapter.ClasSecure.interfaces.Secure;

public class BlackCreditCard implements Secure {
   public void payWithSecureLevelA() {
      System.out.println("Tarjeta Black: Pagando con seguridad ALTA nivel A");
   }

   public void payWithSecureLevelZ() {
   }
}
