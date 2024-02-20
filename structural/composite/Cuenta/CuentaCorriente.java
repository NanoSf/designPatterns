package structural.composite.Cuenta;

public class CuentaCorriente implements CuentaComponente {
   private Double amount;
   private String name;

   public CuentaCorriente(Double amount, String name) {
      this.amount = amount;
      this.name = name;
   }

   public void showAccountName() {
      System.out.println("Cuenta corriente: " + this.name);
   }

   public Double getAmount() {
      return this.amount;
   }
}
