package structural.composite.Cuenta;

public class CuentaAhorro implements CuentaComponente {
   private Double amount;
   private String name;

   public CuentaAhorro(Double amount, String name) {
      this.amount = amount;
      this.name = name;
   }

   public void showAccountName() {
      System.out.println("Cuenta ahorro: " + this.name);
   }

   public Double getAmount() {
      return this.amount;
   }
}
