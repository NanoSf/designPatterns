package structural.proxy;

public class AccestToInternet implements Internet {
   public void connectTo(String url) throws Exception {
      System.out.println("Conectando a: " + url);
   }
}
