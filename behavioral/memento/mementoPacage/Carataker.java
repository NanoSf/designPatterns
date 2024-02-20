package behavioral.memento.mementoPacage;

import java.util.ArrayList;
import java.util.List;

public class Carataker {
   private List<ArticuleMemento> estados = new ArrayList();

   public void addMemento(ArticuleMemento memento) {
      this.estados.add(memento);
   }

   public ArticuleMemento getMemento(int indexMemento) {
      return (ArticuleMemento)this.estados.get(indexMemento);
   }
}
