package creational.builder;

public class PersonaBuilder {
   private Persona persona = new Persona();

   public PersonaBuilder(String primerNombre, String primerApellido) {
      this.persona.primerNombre = primerNombre;
      this.persona.primerApellido = primerApellido;
   }

   public PersonaBuilder segundoNombre(String segundoNombre) {
      this.persona.segundoNombre = segundoNombre;
      return this;
   }

   public PersonaBuilder segundoApellido(String segundoApellido) {
      this.persona.segundoApellido = segundoApellido;
      return this;
   }

   public PersonaBuilderMayor mayor(int edad) {
      if (edad < 18) {
         throw new IllegalArgumentException("No es mayor de edad " + edad);
      } else {
         this.persona.edad = edad;
         return new PersonaBuilderMayor(this.persona);
      }
   }

   public PersonaBuilderMenor menor(int edad) {
      if (edad > 18) {
         throw new IllegalArgumentException("No es menor de edad " + edad);
      } else {
         this.persona.edad = edad;
         return new PersonaBuilderMenor(this.persona);
      }
   }

   public Persona build() {
      return this.persona;
   }
}
