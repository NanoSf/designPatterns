package behavioral.strategy.Strategy;

import behavioral.strategy.Strategy.interfaces.StrategyTextFormatter;

public class CapitalStrategyTestFormatter implements StrategyTextFormatter {
   public void format(String text) {
      System.out.println("Texto en Mayusculas: " + text.toUpperCase());
   }
}
