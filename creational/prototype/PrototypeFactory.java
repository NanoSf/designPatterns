package creational.prototype;

import creational.prototype.ClassPrototype.Amex;
import creational.prototype.ClassPrototype.Visa;
import creational.prototype.ClassPrototype.interfaces.PrototypeCard;
import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
   public static Map<String, PrototypeCard> prototypes = new HashMap();

   public static PrototypeCard getInstance(String tipo) throws CloneNotSupportedException {
      return ((PrototypeCard)prototypes.get(tipo)).clone();
   }

   public static void loadCard() {
      Visa visa = new Visa();
      visa.setName("Esta tarjeta es VISA con numero 0000");
      prototypes.put("VISA", visa);
      Amex amex = new Amex();
      amex.setName("Esta tarjeta es AMEX con numero 0000");
      prototypes.put("AMEX", amex);
   }
}
