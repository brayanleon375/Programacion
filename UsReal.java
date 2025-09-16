import java.util.Scanner;

public class UsReal {
    private String nombre = "";
    private float salario = 0;
    private char genero = 0;
    private String cargo = "";
    public int NumUsua = 0;

    private static final int MAX_UsRealS = 30;
    private static UsReal[] UsReals = new UsReal[MAX_UsRealS];
    private static int cantidadUsReals = 0;
    private static int Indice = -1;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenuPrincipal();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 : agregarUsReal(scanner);
                break;
                case 2 : editarUsReal(scanner);
                break;
                case 3 : verUsReal();
                break;
                case 4 : eliminarUsReal();
                break;
                case 5 : organizarUsReal();
                break;
                case 6 : salir = true;
                default : System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("/--//--//--//--//--//--//--/");
        System.out.println("        MENÚ PRINCIPAL      ");
        System.out.println("/--//--//--//--//--//--//--/");
        System.out.println("1. Agregar Usuario");
        System.out.println("2. Editar Usuario");
        System.out.println("3. Ver Usuario");
        System.out.println("4. Eliminar Usuario");
        System.out.println("5. Ordenar Usuario");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarUsReal(Scanner scanner) {
        if (cantidadUsReals >= MAX_UsRealS) {
            System.out.println("No se pueden agregar más UsReals.");
            return;
        }

        UsReal u = new UsReal();
        u.NumUsua = cantidadUsReals;

        System.out.print("Ingrese nombre: ");
        u.nombre = scanner.nextLine();

        System.out.print("Ingrese salario: ");
        u.salario = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Ingrese género (M/F): ");
        u.genero = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.print("Ingrese cargo: ");
        u.cargo = scanner.nextLine();

        UsReals[cantidadUsReals] = u;
        cantidadUsReals++;

        System.out.println("UsReal agregado correctamente.");
    }

    private static void editarUsReal(Scanner scanner) {
        if (cantidadUsReals == 0) {
            System.out.println("No hay UsReals para editar.");
            return;
        }

        seleccionarUsReal(scanner);
        UsReal u = UsReals[Indice];

        System.out.print("Ingrese nuevo nombre (" + u.nombre + "): ");
        u.nombre = scanner.nextLine();

        System.out.print("Ingrese nuevo salario (" + u.salario + "): ");
        u.salario = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Ingrese nuevo género (" + u.genero + "): ");
        u.genero = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.print("Ingrese nuevo cargo (" + u.cargo + "): ");
        u.cargo = scanner.nextLine();

        System.out.println("UsReal editado correctamente.");
    }

    private static void verUsReal() {
        if (cantidadUsReals == 0) {
            System.out.println("No hay UsReals registrados.");
            return;
        }

        System.out.println("/--//--//--//--//--//--//--/");
        System.out.println("     LISTA DE UsRealS     ");
        System.out.println("/--//--//--//--//--//--//--/");
        for (int i = 0; i < cantidadUsReals; i++) {
            UsReal u = UsReals[i];
            System.out.println("UsReal #" + i);
            System.out.println("Nombre: " + u.nombre);
            System.out.println("Salario: " + u.salario);
            System.out.println("Género: " + u.genero);
            System.out.println("Cargo: " + u.cargo);
            System.out.println("/--//--//--//--/");
        }
    }

    private static void eliminarUsReal() {
        if (cantidadUsReals == 0) {
            System.out.println("No hay UsReals para eliminar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        seleccionarUsReal(scanner);

        for (int i = Indice; i < cantidadUsReals - 1; i++) {
            UsReals[i] = UsReals[i + 1];
        }
        UsReals[cantidadUsReals - 1] = null;
        cantidadUsReals--;

        System.out.println("UsReal eliminado correctamente.");
    }

    private static void seleccionarUsReal(Scanner scanner) {
        System.out.println("UsReals registrados:");
        for (int i = 0; i < cantidadUsReals; i++) {
            System.out.println(i + ". " + UsReals[i].nombre);
        }

        while (true) {
            System.out.print("Seleccione el número de UsReal: ");
            Indice = scanner.nextInt();
            scanner.nextLine();

            if (Indice >= 0 && Indice < cantidadUsReals) {
                break;
            }
            System.out.println("Índice inválido. Intente de nuevo.");
        }
    }
    
    private static void organizarUsReal() {
    if (cantidadUsReals <= 1) {
        return;
    }
    for (int i = 0; i < cantidadUsReals - 1; i++) {
        for (int j = 0; j < cantidadUsReals - 1 - i; j++) {
            if (UsReals[j].nombre.compareToIgnoreCase(UsReals[j + 1].nombre) > 0) {
                UsReal temp = UsReals[j];
                UsReals[j] = UsReals[j + 1];
                UsReals[j + 1] = temp;
            }
            System.out.println("Se han organizado los usuarios");
        }
    }
}
}