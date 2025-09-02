//Kevin Thomas Castañeda, Brayan Esteban Leon - Programación I
import java.util.Scanner;
public class HolaMenu {
    public static int menu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("================================");
        System.out.println("===           Menu           ===");
        System.out.println("===        1. Comida         ===");
        System.out.println("===        2. Bebidas        ===");
        System.out.println("===        3. Postres        ===");
        System.out.println("================================");  
        System.out.println("Elija su tipo de menu");
        opcion = scanner.nextInt();
        return opcion;
    }
    public static int comida(){
        Scanner scanner = new Scanner(System.in);
        int opcionC;
        System.out.println("================================");
        System.out.println("===           Comida         ===");
        System.out.println("===      1. Pizza            ===");
        System.out.println("===      2. Hamburguesa      ===");
        System.out.println("===      3. Perro Caliente   ===");
        System.out.println("===      4. Volver           ===");
        System.out.println("================================"); 
        System.out.println("Elija su comida");
        opcionC = scanner.nextInt(); 
        return opcionC;
    }
    public static int bebida(){
        Scanner scanner = new Scanner(System.in);
        int opcionB;
        System.out.println("================================");
        System.out.println("===           Bebida         ===");
        System.out.println("===        1. Jugo           ===");
        System.out.println("===        2. Gaseosa        ===");
        System.out.println("===        3. Malteada       ===");
        System.out.println("===        4. Volver         ===");
        System.out.println("================================"); 
        System.out.println("Elija su bebida");
        opcionB = scanner.nextInt();
        return opcionB;
    }
    public static int postre(){
        Scanner scanner = new Scanner(System.in);
        int opcionP;
        System.out.println("================================");
        System.out.println("===           Postre         ===");
        System.out.println("===        1. Helado         ===");
        System.out.println("===        2. Gelatina       ===");
        System.out.println("===        3. Torta          ===");
        System.out.println("===        4. Volver         ===");
        System.out.println("================================"); 
        System.out.println("Elija su postre");
        opcionP = scanner.nextInt();
        return opcionP;
    }
    public static int unidad(){
        Scanner scanner = new Scanner(System.in);
        int opcionU;
        System.out.println("================================");
        System.out.println("===          Unidad          ===");
        System.out.println("===       1. 1 Unidad       ===");
        System.out.println("===       2. 2 Unidades     ===");
        System.out.println("===       3. 3 Unidades     ===");
        System.out.println("===       4. Volver         ===");
        System.out.println("================================"); 
        System.out.println("Elija su cantidad de unidades");
        opcionU = scanner.nextInt();
        return opcionU;
    }
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int opcion;
        int opcionC;
        int opcionB;
        int opcionP;
        int controlador = 0;
        while (controlador != 3){
            opcion = menu();
        if (opcion == 1) {
          opcionC = comida();
          if (opcionC == 1){
              System.out.println("Ha seleccionado Pizza");
               opcion = unidad();
          } else if (opcionC == 2){
              System.out.println("Ha seleccionado Hamburguesa");
              opcion = unidad();
          } else if (opcionC == 3){
              System.out.println("Ha seleccionado Perro Caliente");
              opcion = unidad();
          } else if (opcionC == 4){
              menu();
          } else {
              System.out.println("La opcion que ha seleccionado no es valida ;( ");
          }
        } else if (opcion == 2){
            opcionB = bebida();
            if (opcionB == 1){
                System.out.println("Ha seleccionado Jugo");
                opcion = unidad();
            } else if (opcionB == 2){
                System.out.println("Ha seleccionado Gaseosa");
                opcion = unidad();
            } else if (opcionB == 3){
                System.out.println("Ha seleccionado Malteada");
                opcion = unidad();
            } else if (opcionB == 4){
                menu();
            } else {
                System.out.println("La opcion que ha seleccionado no es valida ;( ");
            }
        } else if (opcion == 3) {
            opcionP = postre();
            if (opcionP == 1){
                System.out.println("Ha seleccionado Helado");
                opcion = unidad();
            } else if (opcionP == 2){
                System.out.println("Ha seleccionado Gelatina");
                opcion = unidad();
            } else if (opcionP == 3){
                System.out.println("Ha seleccionado Torta");
                opcion = unidad();
            } else if (opcionP == 4){
                menu();
            } else {
                System.out.println("La opcion que ha seleccionado no es valida ;( ");
            }
        }
    }   
    }
}