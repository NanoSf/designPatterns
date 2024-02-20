package creational.builder;

import java.time.LocalDate;

public class Persona {
   protected String primerNombre;
   protected String segundoNombre;
   protected String primerApellido;
   protected String segundoApellido;
   protected int edad;
   protected String tipoDocumento;
   protected String numeroDocumento;
   protected String sexo;
   protected LocalDate fechaNacimiento;

   protected Persona() {
   }

   public String getPrimerNombre() {
      return this.primerNombre;
   }

   public String getSegundoNombre() {
      return this.segundoNombre;
   }

   public String getPrimerApellido() {
      return this.primerApellido;
   }

   public String getSegundoApellido() {
      return this.segundoApellido;
   }

   public int getEdad() {
      return this.edad;
   }

   public String getTipoDocumento() {
      return this.tipoDocumento;
   }

   public String getNumeroDocumento() {
      return this.numeroDocumento;
   }

   public String getSexo() {
      return this.sexo;
   }

   public LocalDate getFechaNacimiento() {
      return this.fechaNacimiento;
   }

   public String toString() {
      return "Persona{primerNombre='" + this.primerNombre + "', segundoNombre='" + this.segundoNombre + "', primerApellido='" + this.primerApellido + "', segundoApellido='" + this.segundoApellido + "', edad=" + this.edad + ", tipoDocumento='" + this.tipoDocumento + "', numeroDocumento='" + this.numeroDocumento + "', sexo='" + this.sexo + "', fechaNacimiento=" + this.fechaNacimiento + "}";
   }
}
