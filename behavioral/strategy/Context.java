package behavioral.strategy;

import behavioral.strategy.Strategy.interfaces.StrategyTextFormatter;

public class Context {
   private StrategyTextFormatter strategyTextFormatter;

   public Context(StrategyTextFormatter strategyTextFormatter) {
      this.strategyTextFormatter = strategyTextFormatter;
   }

   public void modificarEstrategia(StrategyTextFormatter strategyTextFormatter) {
      this.strategyTextFormatter = strategyTextFormatter;
   }

   public void publishText(String text) {
      this.strategyTextFormatter.format(text);
   }
}
