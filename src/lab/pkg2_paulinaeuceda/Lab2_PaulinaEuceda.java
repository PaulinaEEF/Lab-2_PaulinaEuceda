package lab.pkg2_paulinaeuceda;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_PaulinaEuceda {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Personaje> lista = new ArrayList();
        lista.add(new Personaje("mago","Plutarc","elfo",1.90,190,1800,"Le gusta el chocolate","zebes"));
        lista.add(new Personaje("clerigo","Sam","enano",1.50,90,300,"Vive para las peleas","crateria"));
        lista.add(new Personaje("barbaro","Gustavo","mediano",1.60,130,90,"Disfruta limpiar las armas","norfair"));
        lista.add(new Personaje("picaro","Hugo","humano",1.70,160,35,"Tiene aguante","maridia"));
        
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
                    String clase = lea.next();
                    
                    System.out.print("Ingrese el nombre: ");
                    String nombre = lea.next();
                    
                    System.out.print("Ingrese la raza [mediano, enano, elfo, humano]: ");
                    String raza = lea.next();
                    
                    System.out.print("Ingrese la estatura: ");
                    double estatura = lea.nextDouble();
                    
                    System.out.print("Ingrese el peso: ");
                    int peso = lea.nextInt();
                    
                    System.out.print("Ingrese el edad: ");
                    int edad = lea.nextInt();
                    
                    System.out.print("Ingrese la descripcion: ");
                    String descripcion = lea.nextLine();
                    descripcion = lea.nextLine();   
                    
                    System.out.print("Ingrese la nacionalidad [norfair, brinstar, maridia, zebes, crateria]: ");
                    String nacionalidad = lea.next();
                    
                    lista.add(new Personaje(clase, nombre, raza, estatura, peso, edad, descripcion, nacionalidad));
                    
                    System.out.println(lista);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    resp='n';
                    break;
                default:
                    break;
            }

        }
    }

}
