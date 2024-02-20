package structural.adapter.ClasSecure;

import structural.adapter.ClasSecure.interfaces.Secure;

public class GoldCreditCard implements Secure {
   public void payWithSecureLevelA() {
   }

   public void payWithSecureLevelZ() {
      System.out.println("Tarjeta Gold: Pagando con seguridad BAJA nivel Z");
   }
}
