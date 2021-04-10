//package proyectoparcial1;

import java.util.ArrayList;

import java.util.Scanner;

public class code{
 public static void main(String[] args) {
     String nombre = "";
     String apellidos = "";
     String telefono = "";
     int edad;
     String correo = "";
     String codigo = "";
    //ArrayList<personas> persona = new ArrayList<>();
   // personas p = new personas();

    //public code() {
        System.out.println("Datos personales");
    

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int resp;
        boolean valido1;
        boolean valido2;

        do {
            System.out.println("\nMenu de opciones");
            System.out.println("1. agregar al cliente: ");
            System.out.println("2. Mostrar datos");
            System.out.println("3.salir");
            System.out.println("4. editar");
            //resp = Integer.parseInt(sc.nextLine()));

            try {
                resp = Integer.parseInt(sc.next());

                switch (resp) {
                    case 1:
                        p = new personas();

                        System.out.println("Introduce el nombre: ");
                        nombre = (sc.next());
                        p.setNombre(nombre);

                        System.out.println("Introduce el correo: ");
                        correo = (sc.next());
                        p.setcorreo(correo);

                        System.out.println("Introduce el apellido: ");
                        apellido = (sc.next());
                        p.setApellido(apellido);

                        System.out.println("Introduce la edad: ");
                        do {

                            try {

                                edad = Integer.parseInt(sc.next());
                                valido2 = true;
                                p.setEdad(edad);
                            } catch (Exception e) {
                                System.out.println("Edad no valida ");

                                valido2 = false;

                            }
                        } while (valido2 == false);
                        System.out.println("Introduce su numero telefonico: ");
                        telefono = (sc.next());
                        p.setTelefono(telefono);
                        persona.add(p);
                        break;
                    case 2:

                        for (personas p : persona) {
                            System.out.println(p.getNombre());
                            System.out.println(p.getApellido());
                            System.out.println(p.getEdad());
                            System.out.println(p.getTelefono());
                            System.out.println(p.getcorreo());
                        }
                        break;

                    case 3:
                        System.out.println("Saliste del programa, te deseo un buen dia");
                        System.exit(0);
                        break;
                    case 4:
                        String nuevoNombre;
                        int indiceNombre;
                        System.out.println("Introduce el numero de la persona que vas a modificar");
                        indiceNombre = Integer.parseInt(sc.next());
                        p = persona.get(indiceNombre);
                        System.out.println("introduce un nuevo nombre: ");
                        nuevoNombre = sc.next();
                        p.setNombre(nuevoNombre);
                        persona.set(indiceNombre - 1, p);
                        
                        String nuevoApellido;
                        int indiceApellido;
                        System.out.println("Introduce el numero de la persona que vas a modificar");
                        indiceApellido = Integer.parseInt(sc.next());
                        p = persona.get(indiceApellido);
                        System.out.println("introduce un nuevo telefono: ");
                        nuevoApellido = sc.next();
                        p.setTelefono(nuevoApellido);
                        persona.set(indiceApellido - 1, p);
                        
                        String nuevoTelefono;
                        int indiceTelefono;
                        System.out.println("Introduce el numero de la persona que vas a modificar");
                        indiceTelefono = Integer.parseInt(sc.next());
                        p = persona.get(indiceNombre);
                        System.out.println("introduce un nuevo telefono: ");
                        nuevoTelefono = sc.next();
                        p.setTelefono(nuevoTelefono);
                        persona.set(indiceTelefono - 1, p);
                        
                        
                        break;
                    default:
                        System.out.println("No es una opcion del menu");
                }
            } catch (Exception e) {
                System.out.println("Edicion exitosa");
                resp = 0;
            }

        } while (resp != 3);
    }
}
