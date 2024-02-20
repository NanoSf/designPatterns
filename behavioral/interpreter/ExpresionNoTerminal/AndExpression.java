package behavioral.interpreter.ExpresionesNoTerminal;

import behavioral.interpreter.Expression;

public class AndExpression implements Expression {
   private Expression expression1;
   private Expression expression2;

   public AndExpression(Expression expression1, Expression expression2) {
      this.expression1 = expression1;
      this.expression2 = expression2;
   }

   public boolean interpret(String context) {
      return this.expression1.interpret(context) && this.expression2.interpret(context);
   }
}
