package creational.builder;

import java.time.LocalDate;

public class PersonaBuilderMenor {
   private Persona persona;

   protected PersonaBuilderMenor(Persona persona) {
      this.persona = persona;
   }

   public PersonaBuilderMenor sexo(String sexo) {
      this.persona.sexo = sexo;
      return this;
   }

   public PersonaBuilderMenor fechaNacimiento(LocalDate fechaNacimiento) {
      this.persona.fechaNacimiento = fechaNacimiento;
      return this;
   }

   public Persona build() {
      return this.persona;
   }
}
