package structural.composite.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import structural.composite.Cuenta.CuentaComponente;

public class CuentaComposite implements CuentaComponente {
   private List<CuentaComponente> childCuentas = new ArrayList();

   public void showAccountName() {
      Iterator var1 = this.childCuentas.iterator();

      while(var1.hasNext()) {
         CuentaComponente cuenta = (CuentaComponente)var1.next();
         cuenta.showAccountName();
      }

   }

   public Double getAmount() {
      Double totalAmount = 0.0D;

      CuentaComponente cuenta;
      for(Iterator var2 = this.childCuentas.iterator(); var2.hasNext(); totalAmount = totalAmount + cuenta.getAmount()) {
         cuenta = (CuentaComponente)var2.next();
      }

      System.out.println("La cantidad de dinero es: " + totalAmount);
      return totalAmount;
   }

   public void addCuenta(CuentaComponente cuenta) {
      this.childCuentas.add(cuenta);
   }

   public void removeCuenta(CuentaComponente cuenta) {
      this.childCuentas.remove(cuenta);
   }
}
