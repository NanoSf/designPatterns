package behavioral.state;

import behavioral.state.estados.Sound;
import behavioral.state.estados.interfaces.MovileAlertState;

public class MobileAlertSteteContex {
   private MovileAlertState currentState = new Sound();

   public void setState(MovileAlertState state) {
      this.currentState = state;
   }

   public void alert() {
      this.currentState.alert();
   }
}
