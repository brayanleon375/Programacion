import java.util.Scanner;
public class Menu2 {
    public static int Helados(){
        Scanner scanner = new Scanner (System.in);
        int opcionH = 0;
        System.out.println("================================");
        System.out.println("===          Helados         ===");
        System.out.println("===       1. Bola Pequeña    ===");
        System.out.println("===       2. Bola Mediana    ===");
        System.out.println("===       3. Bola Grande     ===");
        System.out.println("===       4. Especial        ===");
        System.out.println("===       5. Magnifico!      ===");
        System.out.println("===       6. Legendario!! :D ===");
        System.out.println("================================"); 
        System.out.println("Elija su helado");
        return opcionH;
    }
    public static int SwitchS(){
        Scanner scanner = new Scanner (System.in);
        String sabor= "";
        int opcionS = 0;
        opcionS = scanner.nextInt();
                switch(opcionS){
                        case 1:{
                            System.out.println("Ha elegido Vainilla");
                            opcionS = Toppings();
                            sabor = "Vainilla";
                            break;

                        }
                        case 2:{
                            System.out.println("Ha elegido Chocolate");
                            opcionS = Toppings();
                            sabor = "Chocolate";
                            break;
                        }
                        case 3:{
                            System.out.println("Ha elegido Fresa");
                            opcionS = Toppings();
                            sabor = "Fresa";
                            break;
                        }
                        case 4:{
                            System.out.println("Ha elegido Menta");
                            opcionS = Toppings();
                            sabor = "Menta";
                            break;
                        }
                        case 5:{
                            System.out.println("Ha elegido Cookies and Cream");
                            opcionS = Toppings();
                            sabor = "Cookies and Cream";
                            break;
                        }
                }
           return opcionS;     
    }
    public static int SwitchT(){
        Scanner scanner = new Scanner (System.in);
        String topping = "";
        int opcionT = 0;
        opcionT = scanner.nextInt();
                switch(opcionT){
                        case 1:{
                            System.out.println("Ha elegido chispas");
                            opcionT = Jarabes();
                            topping = "Chispas";
                            break;                      
                        }
                        case 2:{
                            System.out.println("Ha elegido galleta");
                            opcionT = Jarabes();
                            topping = "Galleta";
                            break;
                        }
                        case 3:{
                            System.out.println("Ha elegido Leche chocobrake");
                            opcionT = Jarabes();
                            topping = "Leche chocobrake";
                            break;
                        }
                        case 4:{
                            System.out.println("Ha elegido Mani");
                            opcionT = Jarabes();
                            topping = "Mani";
                            break;
                        }
                        case 5:{
                            System.out.println("Ha elegido volver al menu anterior");
                            opcionT = Toppings();
                            break;
                        }
                }
                
                return opcionT;
    }
    public static int SwitchJ(){
        Scanner scanner = new Scanner (System.in);
        String jarabe = "";
        int opcionJ = 0;
        opcionJ = scanner.nextInt();
                switch(opcionJ){
                        case 1:{
                            System.out.println("Ha elegido Salsa de chicle");
                            opcionJ = Helados();
                            jarabe = "Salsa de chicle";
                            break;                      
                        }
                        case 2:{
                            System.out.println("Ha elegido Chocolate");
                            opcionJ = Helados();
                            jarabe = "Chocolate";
                            break;
                        }
                        case 3:{
                            System.out.println("Ha elegido Leche Condensada");
                            opcionJ = Helados();
                            jarabe = "Leche Condensada";
                            break;
                        }
                        case 4:{
                            System.out.println("Volver al menu anterior");
                            opcionJ = Toppings();
                            break;
                        }
                    }
                return opcionJ;
    }
    public static int Jarabes(){
        int opcionJ = 0;
        System.out.println("=================================");
        System.out.println("===          Jarabes          ===");
        System.out.println("===       1. Salsa de chicle  ===");
        System.out.println("===       2. Chocolate        ===");
        System.out.println("===       3. Leche Condensada ===");
        System.out.println("===       4. Volver           ===");
        System.out.println("=================================");
        System.out.println("Elija su jarabe");
        return opcionJ;
    }
    public static int Toppings(){
        int opcionT = 0;
        System.out.println("=================================");
        System.out.println("===          Toppings         ===");
        System.out.println("===        1. Chispas         ===");
        System.out.println("===        2. Galleta         ===");
        System.out.println("===        3. Chocobrake      ===");
        System.out.println("===        4. Mani            ===");
        System.out.println("===        5. Volver          ===");
        System.out.println("================================="); 
        System.out.println("Elija su topping");
        return opcionT;
    }
    public static int Sabores(){
        int opcionS = 0;
        System.out.println("=================================");
        System.out.println("===           Sabores         ===");
        System.out.println("===        1. Vainilla        ===");
        System.out.println("===        2. Chocolate       ===");
        System.out.println("===        3. Fresa           ===");
        System.out.println("===        4. Menta           ===");
        System.out.println("===        5. Cookies & Cream ===");
        System.out.println("===        6. Volver          ===");
        System.out.println("================================="); 
        System.out.println("Elija su sabor");
        return opcionS;
    }
    public static void main(String[] args) {
        String helado = "";
        String sabor = "";
        String topping = "";
        String jarabe = "";
        int opcionH = 0;
        int opcionS = 0;
        int opcionT = 0;
        int opcionJ = 0;
        System.out.println("Bienvenido a Heladerias Tommy");
        Helados();
        Scanner scanner = new Scanner (System.in);
            opcionH = scanner.nextInt();
            switch (opcionH){
                case 1:{
                    System.out.println("Ha elegido una bola pequeña");
                    opcionH = Sabores();
                    opcionS = SwitchS();
                    opcionT = SwitchT();
                    opcionJ = SwitchJ();
                    helado = "Bola pequeña";
                    System.out.println("=== Resumen del pedido ===");
                    System.out.println("Helado: " + helado);
                    System.out.println("Sabor: " + sabor);
                    System.out.println("Topping: " + topping);
                    System.out.println("Jarabe: " + jarabe);
                    System.out.println("============================");
                    break;
                }
                case 2:{
                    System.out.println("Ha elegido una bola mediana");
                    opcionH = Sabores();
                    opcionS = SwitchS();
                    opcionT = SwitchT();
                    opcionJ = SwitchJ();
                    helado = "Bola mediana";
                    System.out.println("=== Resumen del pedido ===");
                    System.out.println("Helado: " + helado);
                    System.out.println("Sabor: " + sabor);
                    System.out.println("Topping: " + topping);
                    System.out.println("Jarabe: " + jarabe);
                    System.out.println("============================");
                    break;
                }
                case 3:{
                    System.out.println("Ha elegido una bola grande");
                    opcionH = Sabores();
                    opcionS = SwitchS();
                    opcionT = SwitchT();
                    opcionJ = SwitchJ();
                    helado = "Bola grande";
                    System.out.println("=== Resumen del pedido ===");
                    System.out.println("Helado: " + helado);
                    System.out.println("Sabor: " + sabor);
                    System.out.println("Topping: " + topping);
                    System.out.println("Jarabe: " + jarabe);
                    System.out.println("============================");
                    break;
                }
                case 4:{
                    System.out.println("Ha elegido un helado especial");
                    opcionH = Sabores();
                    opcionS = SwitchS();
                    opcionT = SwitchT();
                    opcionJ = SwitchJ();
                    helado = "Helado especial";
                    System.out.println("=== Resumen del pedido ===");
                    System.out.println("Helado: " + helado);
                    System.out.println("Sabor: " + sabor);
                    System.out.println("Topping: " + topping);
                    System.out.println("Jarabe: " + jarabe);
                    System.out.println("============================");
                    break;
                }
                case 5:{
                    System.out.println("Ha elegido un helado magnifico");
                    opcionH = Sabores();
                    opcionS = SwitchS();
                    opcionT = SwitchT();
                    opcionJ = SwitchJ();
                    helado = "Helado magnifico";
                    System.out.println("=== Resumen del pedido ===");
                    System.out.println("Helado: " + helado);
                    System.out.println("Sabor: " + sabor);
                    System.out.println("Topping: " + topping);
                    System.out.println("Jarabe: " + jarabe);
                    System.out.println("============================");
                    break;
                }
                case 6:{
                    System.out.println("Ha elegido un helado legendario");
                    opcionH = Sabores();
                    opcionS = SwitchS();
                    opcionT = SwitchT();
                    opcionJ = SwitchJ();
                    helado = "Helado legendario";
                    System.out.println("=== Resumen del pedido ===");
                    System.out.println("Helado: " + helado);
                    System.out.println("Sabor: " + sabor);
                    System.out.println("Topping: " + topping);
                    System.out.println("Jarabe: " + jarabe);
                    System.out.println("============================");
                    break;
                }
            
                }
            }

        }