package ec.edu.ec.poo.principal;
import ec.edu.ec.poo.clases.Personaclase;
public class PrincipalClase {
        public static void main(String[] args) {
            Personaclase persona = new Personaclase();
            persona.setCedula("0988414010");
            String nombre= persona.getCedula();
            System.out.println(nombre);


        }

}

