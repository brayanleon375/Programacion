import java.util.Scanner;

public class usuario {
    private String nombre = "";
    private float salario = 0;
    private char genero = 0;
    private String cargo = "";


    private static final int MAX_USUARIOS = 30;
    private static usuario[] usuarios = new usuario[MAX_USUARIOS];
    private static int cantidadUsuarios = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            char opcion = menu();
            switch (opcion) {
                case 'a':
                case 'A':
                    crearUsuario();
                    break;
                case 'b':
                case 'B':
                    editarUsuario();
                    break;
                case 'c':
                case 'C':
                    verUsuario();
                    break;
                case 'd':
                case 'D':
                    eliminarUsuario();
                    break;
                case 'e':
                case 'E':
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }

    public static char menu() {
        char opcion = ' ';
        System.out.println("\n|----------> OPCIONES <----------| ");
        System.out.println("---> a. Crear usuario");
        System.out.println("---> b. Editar usuario ");
        System.out.println("---> c. Ver usuario ");
        System.out.println("---> d. Eliminar usuario ");
        System.out.println("---> e. Salir ");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.next().charAt(0);
        return opcion;
    }

    public static void crearUsuario() {
        if (cantidadUsuarios >= MAX_USUARIOS) {
            System.out.println("No se pueden agregar más usuarios.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        usuario nuevo = new usuario();
        System.out.println("Ingrese el nombre del usuario: ");
        nuevo.nombre = scanner.nextLine();
        System.out.println("Ingrese el salario del usuario: ");
        nuevo.salario = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Ingrese el sexo del usuario (M/F): ");
        nuevo.genero = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println("Ingrese el cargo del usuario: ");
        nuevo.cargo = scanner.nextLine();
        usuarios[cantidadUsuarios++] = nuevo;
        System.out.println("El usuario con nombre: " + nuevo.nombre + ", ha sido creado exitosamente.");
    }

    public static void verUsuario() {
        if (cantidadUsuarios == 0) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        int idx = seleccionarUsuario();
        if (idx == -1) return;
        usuario u = usuarios[idx];
        System.out.println("\n|----------> Datos del usuario <----------|");
        System.out.println("Nombre --> " + u.nombre);
        System.out.println("Salario --> " + u.salario);
        System.out.println("Género --> " + u.genero);
        System.out.println("Cargo --> " + u.cargo);
    }

    public static void eliminarUsuario() {
        if (cantidadUsuarios == 0) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        int idx = seleccionarUsuario();
        if (idx == -1) return;
        for (int i = idx; i < cantidadUsuarios - 1; i++) {
            usuarios[i] = usuarios[i + 1];
        }
        usuarios[cantidadUsuarios - 1] = null;
        cantidadUsuarios--;
        System.out.println("Usuario eliminado exitosamente.");
    }

    public static void editarUsuario() {
        if (cantidadUsuarios == 0) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        int idx = seleccionarUsuario();
        if (idx == -1) return;
        usuario u = usuarios[idx];
        Scanner scanner = new Scanner(System.in);
        boolean editar = true;
        while (editar) {
            System.out.println("\n|----------> ¿Qué dato desea editar? <----------|");
            System.out.println("a. Nombre --> (actual: " + u.nombre + ")");
            System.out.println("b. Salario --> (actual: " + u.salario + ")");
            System.out.println("c. Género --> (actual: " + u.genero + ")");
            System.out.println("d. Cargo --> (actual: " + u.cargo + ")");
            System.out.println("e. Salir de edición");
            char opcion = scanner.next().charAt(0);
            scanner.nextLine();
            switch (opcion) {
                case 'a':
                case 'A':
                    System.out.print("Ingrese el nuevo nombre: ");
                    u.nombre = scanner.nextLine();
                    break;
                case 'b':
                case 'B':
                    System.out.print("Ingrese el nuevo salario: ");
                    u.salario = scanner.nextFloat();
                    scanner.nextLine();
                    break;
                case 'c':
                case 'C':
                    System.out.print("Ingrese el nuevo género (M/F): ");
                    u.genero = scanner.next().charAt(0);
                    scanner.nextLine();
                    break;
                case 'd':
                case 'D':
                    System.out.print("Ingrese el nuevo cargo: ");
                    u.cargo = scanner.nextLine();
                    break;
                case 'e':
                case 'E':
                    editar = false;
                    System.out.println("Edición finalizada.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    // Método para seleccionar usuario por índice
    private static int seleccionarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Usuarios registrados:");
        for (int i = 0; i < cantidadUsuarios; i++) {
            System.out.println(i + ". " + usuarios[i].nombre);
        }
        System.out.print("Seleccione el número de usuario: ");
        int idx = scanner.nextInt();
        scanner.nextLine();
        if (idx < 0 || idx >= cantidadUsuarios) {
            System.out.println("Índice inválido.");
            return -1;
        }
        return idx;
    }
}