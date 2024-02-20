package behavioral.strategy.Strategy;

import behavioral.strategy.Strategy.interfaces.StrategyTextFormatter;

public class LowerStrategyTestFormatter implements StrategyTextFormatter {
   public void format(String text) {
      System.out.println("Texto en Minusculas: " + text.toLowerCase());
   }
}
