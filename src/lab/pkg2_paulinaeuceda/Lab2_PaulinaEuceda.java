package lab.pkg2_paulinaeuceda;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_PaulinaEuceda {

    static Scanner lea = new Scanner(System.in);
    static Random ran = new Random();

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
                    System.out.println(lista.get(lista.size() - 1));
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
                                respue = 'n';
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

                    System.out.println("");
                    break;
                case 5:
                    Asignar(lista);
                    break;
                case 6:
                    resp = 'n';
                    break;
                default:
                    break;
            }

        }
    }

    public static void Asignar(ArrayList<Personaje> lista) {
        int hpu = 0, hpm = 0; //hit points del usuario y de la maquina
        int csu = 0, csm = 0; //critic strike del usuario y la maquina
        int acu = 0, acm = 0; //critic strike del usuario y la maquina
        int dgu = 0, dgm = 0; //critic strike del usuario y la maquina

        for (int i = 0; i < lista.size(); i++) {
            int n = i + 1;
            System.out.println(n + ") " + lista.get(i));
        }
        System.out.println("");

        System.out.print("Elija el personaje que desea: ");
        int perusuario = lea.nextInt();
        perusuario--;

        System.out.print("Elila el personaje de la maquina: ");
        int permaquina = lea.nextInt();
        permaquina--;

        if (lista.get(perusuario).getRaza() == "mediano") {
            hpu = 50 + ran.nextInt(10);
        } else if (lista.get(perusuario).getRaza() == "enano") {
            hpu = 80 + ran.nextInt(20);
        } else if (lista.get(perusuario).getRaza() == "elfo") {
            hpu = 50 + ran.nextInt(20);
        } else if (lista.get(perusuario).getRaza() == "humano") {
            hpu = 40 + ran.nextInt(35);
        }

        if (lista.get(permaquina).getRaza() == "medianos") {
            hpm = 50 + ran.nextInt(10);
        } else if (lista.get(permaquina).getRaza() == "enano") {
            hpm = 80 + ran.nextInt(20);
        } else if (lista.get(permaquina).getRaza() == "elfo") {
            hpm = 50 + ran.nextInt(20);
        } else if (lista.get(permaquina).getRaza() == "humano") {
            hpm = 40 + ran.nextInt(35);
        }

        if (lista.get(perusuario).getClase() == "clerigo") {
            dgu = 5 + ran.nextInt(10);
            csu = 97;
            acu = 40;
        } else if (lista.get(perusuario).getClase() == "barbaro") {
            dgu = 15 + ran.nextInt(15);
            csu = 93;
            acu = 65;
        } else if (lista.get(perusuario).getClase() == "mago") {
            dgu = 5 + ran.nextInt(5);
            csu = 101;
            acu = 20;
        } else if (lista.get(perusuario).getClase() == "picaro") {
            dgu = 15 + ran.nextInt(10);
            csu = 80;
            acu = 50;
        }

        if (lista.get(permaquina).getClase() == "clerigo") {
            dgm = 5 + ran.nextInt(10);
            csm = 97;
            acm = 40;
        } else if (lista.get(permaquina).getClase() == "barbaro") {
            dgm = 15 + ran.nextInt(15);
            csm = 93;
            acm = 65;
        } else if (lista.get(permaquina).getClase() == "mago") {
            dgm = 5 + ran.nextInt(10);
            csm = 101;
            acm = 20;
        } else if (lista.get(permaquina).getClase() == "picaro") {
            dgm = 15 + ran.nextInt(10);
            csm = 80;
            acm = 50;
        }

        int omaquina; //esta variable lleva que opcion escoge la maquina, si atacar o defender

        int ganador=0;
        boolean flag = true;
        int turno = 0;

        while (flag) {
            System.out.println("Hitpoints del usuario "+hpu);
            System.out.println("Hitpoints de la maquina "+hpm);
            int suma=0;
            omaquina = 1 + ran.nextInt(2);

            System.out.println("");
            System.out.println("1) Atacar");
            System.out.println("2) Defender");
            System.out.print("Ingrese la accion que desea: ");
            int accion = lea.nextInt();
            switch (accion) {
                case 1:
                    int ataque = 1 + ran.nextInt(100);
                    if (ataque > acm) {
                        if (ataque > csm) {
                            hpm = hpm - (csm * 2);
                        } else {
                            hpm =hpm- csm;
                        }
                        System.out.println("La maquina ahora tiene "+(hpm)+" hitpoints");
                    } else{
                        System.out.println("El usuario no generó daño");
                    }
                    break;
                case 2:
                    suma = 15;
                    break;
                default:
                    break;
            }
            System.out.println("");
            
            omaquina = 1+ran.nextInt(2);
            
            switch (omaquina) {
                case 1:
                    System.out.println("La maquina atacó");
                    int ataque = 1 + ran.nextInt(100);
                    if (ataque > (acu+suma)) {
                        if (ataque > csu) {
                            hpu = hpu - (csu * 2);
                        } else {
                            hpu =hpu- csu;
                        }
                        System.out.println("El usuario ahora tiene "+hpu+" hitpoints");
                    } else{
                        System.out.println("La maquina no generó daño");
                    }
                    suma = 0;
                    break;
                case 2:
                    suma = 15;
                    System.out.println("La maquina defiende");
                    break;
                default:
                    break;
            }
            
            
            
            if(hpm<=0 && hpu <=0){
                ganador =3;
                flag = false;
            } else if (hpu<=0){
                ganador=1;
                flag = false;
            } else if(hpm<=0){
                ganador =2;
                flag = false;
            }
            System.out.println("");
            
        }
        
        if (ganador==2) {
            System.out.println("Ganó el usario");
        } else if(ganador == 1){
            System.out.println("Ganó la maquina");
        } else{
            System.out.println("Empate");
        }
        
        System.out.println("");
    }

    

}
