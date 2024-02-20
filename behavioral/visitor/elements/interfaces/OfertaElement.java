package behavioral.visitor.elements.interfaces;

import behavioral.visitor.visitor.interfaces.CreditCardVisitor;

public interface OfertaElement {
   void accept(CreditCardVisitor var1);

   void tipoOferta(String var1);
}
