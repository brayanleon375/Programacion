//Kevin Thomas Castañeda, Brayan Esteban Leon - Programación I
import java.util.Scanner;
public class Ventas{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("/-//-//-//-//-//-//-//-//-//-/-//-//-//-//-//-//-//-//-//-/\\n" + //
                        "");
        System.out.println("/-/                       Sistema de ventas             /-/\\n" + //
                        "");
        System.out.println("/-/                       Heladeria  Tommy             /-/\\n" + //
                        "");
        System.out.println("/-/                             Menu                   /-/\\n" + //
                        "");
        System.out.println("/-/ 1. Helado de Vainilla...........................$10 /-/\\n" + //
                        "");
        System.out.println("/-/ 2. Helado de Chocolate..........................$10 /-/\\n" + //
                        "");
        System.out.println("/-/ 3. Helado de Fresa..............................$10 /-/\\n" + //
                        "");
        System.out.println("/-/ 4. Helado de Menta..............................$10 /-/\\n" + //
                        "");
        System.out.println("/-/ 5. Helado de Mango..............................$10 /-/\\n" + //
                        "");
        System.out.println("/-/ 6. Helado de Limon..............................$10 /-/\\n" + //
                        "");
        System.out.println("/-/ 7. Helado de Coco...............................$10 /-/\\n" + //
                        "");
        System.out.println("/-//-//-//-//-//-//-//-//-//-/-//-//-//-//-//-//-//-//-//-/");
        
        System.out.print("Ingrese el numero de opcion que desea comprar: ");       
         opcion = scanner.nextInt();
        if (opcion >= 1 && opcion <= 7){
            if (opcion == 1){
                System.out.println("Ha seleccionado Helado de Vainilla, el precio es $10");
            }
            else if (opcion == 2){
                System.out.println("Ha seleccionado Helado de Chocolate, el precio es $10");
            }
            else if (opcion == 3){
                System.out.println("Ha seleccionado Helado de Fresa, el precio es $10");
            }
            else if (opcion == 4){
                System.out.println("Ha seleccionado Helado de Menta, el precio es $10");
            }
            else if (opcion == 5){
                System.out.println("Ha seleccionado Helado de Mango, el precio es $10");
            }
            else if (opcion == 6){
                System.out.println("Ha seleccionado Helado de Limon, el precio es $10");
            }
            else if (opcion == 7){
                System.out.println("Ha seleccionado Helado de Coco, el precio es $10");
            }
        } else {
            System.out.println("Opcion no valida, por favor seleccione una opcion del 1 al 7");
        }
    }
}