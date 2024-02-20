package behavioral.memento.mementoPacage;

public class ArticuleMemento {
   private String author;
   private String texto;

   public ArticuleMemento(String author, String texto) {
      this.author = author;
      this.texto = texto;
   }

   public String getAuthor() {
      return this.author;
   }

   public String getTexto() {
      return this.texto;
   }
}
