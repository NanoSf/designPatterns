package behavioral.interpreter.ExpresionesTerminales;

import behavioral.interpreter.Expression;

public class TerminalExpression implements Expression {
   private String text;

   public TerminalExpression(String text) {
      this.text = text;
   }

   public boolean interpret(String context) {
      return context.contains(this.text);
   }
}
