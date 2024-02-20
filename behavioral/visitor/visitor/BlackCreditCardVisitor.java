package behavioral.visitor.visitor;

import behavioral.visitor.elements.OfertaGasolina;
import behavioral.visitor.elements.OfertaVuelos;
import behavioral.visitor.visitor.interfaces.CreditCardVisitor;

public class BlackCreditCardVisitor implements CreditCardVisitor {
   public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
      System.out.println("Descuento del 10% en gasolina con tu tarjeta Black");
      ofertaGasolina.tipoOferta("Black Gasolina");
   }

   public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
      System.out.println("Descuento del 25% en gasolina con tu tarjeta Black");
      ofertaVuelos.tipoOferta("Black Vuelos");
   }
}
