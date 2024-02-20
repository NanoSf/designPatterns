package behavioral.visitor.visitor.interfaces;

import behavioral.visitor.elements.OfertaGasolina;
import behavioral.visitor.elements.OfertaVuelos;

public interface CreditCardVisitor {
   void ofertaGasolina(OfertaGasolina var1);

   void ofertaVuelos(OfertaVuelos var1);
}
