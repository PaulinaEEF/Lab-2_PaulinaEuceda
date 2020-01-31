package lab.pkg2_paulinaeuceda;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_PaulinaEuceda {

    public static void main(String[] args) {
        // TODO code application logic here
        String clase, nombre, raza;
        double estatura;
        int peso, edad;
        String descripcion, nacionalidad;

        ArrayList<Personaje> lista = new ArrayList();
        lista.add(new Personaje("mago", "Plutarc", "elfo", 1.90, 190, 1800, "Le gusta el chocolate", "zebes"));
        lista.add(new Personaje("clerigo", "Sam", "enano", 1.50, 90, 300, "Vive para las peleas", "crateria"));
        lista.add(new Personaje("barbaro", "Gustavo", "mediano", 1.60, 130, 90, "Disfruta limpiar las armas", "norfair"));
        lista.add(new Personaje("picaro", "Hugo", "humano", 1.70, 160, 35, "Tiene aguante", "maridia"));

        Scanner lea = new Scanner(System.in);
        char resp = 's';
        while (resp == 's') {
            System.out.println("1) Creacion de personajes");
            System.out.println("2) Modificar personajes");
            System.out.println("3) Ver atributos de un personaje");
            System.out.println("4) Eliminar personajes");
            System.out.println("5) Combate");
            System.out.println("6) Salir");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la clase [clerigo, barbaro, mago, picaro]: ");
                    clase = lea.next();

                    System.out.print("Ingrese el nombre: ");
                    nombre = lea.next();

                    System.out.print("Ingrese la raza [mediano, enano, elfo, humano]: ");
                    raza = lea.next();

                    System.out.print("Ingrese la estatura: ");
                    estatura = lea.nextDouble();

                    System.out.print("Ingrese el peso: ");
                    peso = lea.nextInt();

                    System.out.print("Ingrese el edad: ");
                    edad = lea.nextInt();

                    System.out.print("Ingrese la descripcion: ");
                    descripcion = lea.nextLine();
                    descripcion = lea.nextLine();

                    System.out.print("Ingrese la nacionalidad [norfair, brinstar, maridia, zebes, crateria]: ");
                    nacionalidad = lea.next();

                    lista.add(new Personaje(clase, nombre, raza, estatura, peso, edad, descripcion, nacionalidad));
                    System.out.println("");
                    break;
                case 2:
                    for (int i = 0; i < lista.size(); i++) {
                        int n = i + 1;
                        System.out.println(n + ") " + lista.get(i));
                    }
                    System.out.println("");
                    System.out.print("Ingrese el indice del personaje que desea modificar: ");
                    int pos = lea.nextInt();
                    pos--;
                    
                    char respue = 's';
                    while (respue == 's') {
                        System.out.println("1) Modificar clase");
                        System.out.println("2) Modificar nombre");
                        System.out.println("3) Modificar raza");
                        System.out.println("4) Modificar estatura");
                        System.out.println("5) Modificar peso");
                        System.out.println("6) Modificar edad");
                        System.out.println("7) Modificar descripcion");
                        System.out.println("8) Modificar nacionalidad");
                        System.out.println("9) Modificar nacionalidad");
                        System.out.print("Ingrese lo que desea modificar: ");
                        int mod = lea.nextInt();
                        switch (mod) {
                            case 1:
                                System.out.print("Ingrese la clase [clerigo, barbaro, mago, picaro]: ");
                                clase = lea.next();
                                lista.get(pos).setClase(clase);
                                break;

                            case 2:
                                System.out.print("Ingrese el nombre: ");
                                nombre = lea.next();
                                lista.get(pos).setNombre(nombre);

                                break;
                            case 3:
                                System.out.print("Ingrese la raza [mediano, enano, elfo, humano]: ");
                                raza = lea.next();
                                lista.get(pos).setRaza(raza);

                                break;
                            case 4:
                                System.out.print("Ingrese la estatura: ");
                                estatura = lea.nextDouble();
                                lista.get(pos).setEstatura(estatura);

                                break;
                            case 5:
                                System.out.print("Ingrese el peso: ");
                                peso = lea.nextInt();
                                lista.get(pos).setPeso(peso);

                                break;
                            case 6:
                                System.out.print("Ingrese el edad: ");
                                edad = lea.nextInt();
                                lista.get(pos).setAños(edad);

                                break;
                            case 7:
                                System.out.print("Ingrese la descripcion: ");
                                descripcion = lea.nextLine();
                                descripcion = lea.nextLine();
                                lista.get(pos).setDescripcion(descripcion);

                                break;
                            case 8:
                                System.out.print("Ingrese la nacionalidad [norfair, brinstar, maridia, zebes, crateria]: ");
                                nacionalidad = lea.next();
                                lista.get(pos).setNacionalidad(nacionalidad);
                                break;
                            case 9:
                                respue='n';
                                break;
                            default:
                                break;

                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    for (int i = 0; i < lista.size(); i++) {
                        int n = i + 1;
                        System.out.println(n + ") " + lista.get(i));
                    }
                    System.out.println("");
                    break;
                case 4:
                    for (int i = 0; i < lista.size(); i++) {
                        int n = i + 1;
                        System.out.println(n + ") " + lista.get(i));
                    }
                    System.out.println("");
                    System.out.print("Ingrese la posicion del jugador que desea eliminar: ");
                    int posicion = lea.nextInt();
                    posicion--;
                    lista.remove(posicion);
                    
                    for (int i = 0; i < lista.size(); i++) {
                        int n = i + 1;
                        System.out.println(n + ") " + lista.get(i));
                    }
                    break;
                case 5:

                    break;
                case 6:
                    resp = 'n';
                    break;
                default:
                    break;
            }

        }
    }

}
