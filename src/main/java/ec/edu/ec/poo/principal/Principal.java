package ec.edu.ec.poo.principal;

import ec.edu.ec.poo.clases.Familiar;
import ec.edu.ec.poo.clases.Persona;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de personas
        System.out.println("Ingrese la cantidad de personas:");
        int nPersonas = scanner.nextInt();
        Persona[] personas = new Persona[nPersonas];

        for (int i = 0; i < nPersonas; i++) {
            Persona persona = new Persona();
            System.out.println("Ingrese la cedula de la persona:");
            String cedula = scanner.next();
            System.out.println("Ingrese el nombre de la persona:");
            String nombre = scanner.next();
            System.out.println("Ingrese el apellido de la persona:");
            String apellido = scanner.next();
            System.out.println("Ingrese la direccion de la persona:");
            String direccion = scanner.next();

            persona.setCedula(cedula);
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setDireccion(direccion);

            personas[i] = persona;
        }

        // Ingreso de familiares
        System.out.println("Ingrese la cantidad de familiares:");
        int nFamiliares = scanner.nextInt();
        Familiar[] familiares = new Familiar[nFamiliares];

        for (int i = 0; i < nFamiliares; i++) {
            Familiar familiar = new Familiar();
            System.out.println("Ingrese la cedula del familiar:");
            String cedula = scanner.next();
            System.out.println("Ingrese el nombre del familiar:");
            String nombre = scanner.next();
            System.out.println("Ingrese el apellido del familiar:");
            String apellido = scanner.next();
            System.out.println("Ingrese la direccion del familiar:");
            String direccion = scanner.next();
            System.out.println("Ingrese el parentesco del familiar:");
            String parentesco = scanner.next();
            System.out.println("Ingrese el tipo de sangre del familiar:");
            String tipoDeSangre = scanner.next();

            System.out.println("Ingrese la fecha de nacimiento del familiar (año, mes, día):");
            int año = scanner.nextInt();
            int mes = scanner.nextInt() - 1; // Meses en GregorianCalendar son 0-11
            int dia = scanner.nextInt();
            GregorianCalendar fechaNacimiento = new GregorianCalendar(año, mes, dia);
            familiar.setFechaDeNacimiento(fechaNacimiento);

            familiar.setCedula(cedula);
            familiar.setNombre(nombre);
            familiar.setApellido(apellido);
            familiar.setDireccion(direccion);
            familiar.setParentesco(parentesco);
            familiar.setTipoDeSangre(tipoDeSangre);

            familiares[i] = familiar;
        }

        // Mostrar información de las personas
        System.out.println("\nInformación de las Personas:");
        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println(" ");
        }

        // Mostrar información de los familiares
        System.out.println("\nInformación de los Familiares:");
        for (Familiar familiar : familiares) {
            System.out.println(familiar);
            System.out.println(" ");
        }
    }
}