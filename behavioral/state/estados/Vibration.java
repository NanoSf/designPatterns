package behavioral.state.estados;

import behavioral.state.estados.interfaces.MovileAlertState;

public class Vibration implements MovileAlertState {
   public void alert() {
      System.out.println("Vibrando...Vibrando...");
   }
}
