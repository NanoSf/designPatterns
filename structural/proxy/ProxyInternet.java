package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
   private Internet internet = new AccestToInternet();
   private static List<String> bannedUrl = new ArrayList();

   public void connectTo(String url) throws Exception {
      if (bannedUrl.contains(url)) {
         throw new Exception("URL bloqueada acceso denegado - Consulta con tu administrador");
      } else {
         this.internet.connectTo(url);
      }
   }

   static {
      bannedUrl.add("twitter.com");
      bannedUrl.add("facebook.com");
      bannedUrl.add("google.com");
   }
}
