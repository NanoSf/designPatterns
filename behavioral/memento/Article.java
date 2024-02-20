package behavioral.memento;

import behavioral.memento.mementoPacage.ArticuleMemento;

public class Article {
   private String author;
   private String texto;

   public Article(String author, String texto) {
      this.author = author;
      this.texto = texto;
   }

   public String getAuthor() {
      return this.author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public String getTexto() {
      return this.texto;
   }

   public void setTexto(String texto) {
      this.texto = texto;
   }

   public ArticuleMemento createMemento() {
      ArticuleMemento memento = new ArticuleMemento(this.author, this.texto);
      return memento;
   }

   public void restoreMemento(ArticuleMemento memento) {
      this.author = memento.getAuthor();
      this.texto = memento.getTexto();
   }
}
