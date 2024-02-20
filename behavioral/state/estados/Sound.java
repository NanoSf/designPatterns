package behavioral.state.estados;

import behavioral.state.estados.interfaces.MovileAlertState;

public class Sound implements MovileAlertState {
   public void alert() {
      System.out.println("Ring...Ring...");
   }
}
