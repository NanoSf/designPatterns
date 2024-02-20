package creational.builder;

public class PersonaBuilderMayor {
   private Persona personaMayor;

   public PersonaBuilderMayor(Persona persona) {
      this.personaMayor = persona;
   }

   public PersonaBuilderMayor tipoDocumento(String tipoDocumento) {
      this.personaMayor.tipoDocumento = tipoDocumento;
      return this;
   }

   public PersonaBuilderMayor numeroDocumento(String numeroDocumento) {
      this.personaMayor.numeroDocumento = numeroDocumento;
      return this;
   }

   public Persona build() {
      return this.personaMayor;
   }
}
