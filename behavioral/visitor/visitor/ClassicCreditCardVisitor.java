package behavioral.visitor.visitor;

import behavioral.visitor.elements.OfertaGasolina;
import behavioral.visitor.elements.OfertaVuelos;
import behavioral.visitor.visitor.interfaces.CreditCardVisitor;

public class ClassicCreditCardVisitor implements CreditCardVisitor {
   public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
      System.out.println("Descuento del 3% en gasolina con tu tarjeta Clasica");
      ofertaGasolina.tipoOferta("Clasica Gasolina");
   }

   public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
      System.out.println("Descuento del 5% en gasolina con tu tarjeta Clasica");
      ofertaVuelos.tipoOferta("Clasica Vuelos");
   }
}
