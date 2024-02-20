package behavioral.state.estados;

import behavioral.state.estados.interfaces.MovileAlertState;

public class Silent implements MovileAlertState {
   public void alert() {
      System.out.println("Silencion...Pantalla Iluminada...");
   }
}
