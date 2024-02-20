package behavioral.visitor.elements;

import behavioral.visitor.elements.interfaces.OfertaElement;
import behavioral.visitor.visitor.interfaces.CreditCardVisitor;

public class OfertaVuelos implements OfertaElement {
   public void accept(CreditCardVisitor visitor) {
      visitor.ofertaVuelos(this);
   }

   public void tipoOferta(String mensaje) {
      System.out.println("Enviar mensaje: " + mensaje);
   }
}
