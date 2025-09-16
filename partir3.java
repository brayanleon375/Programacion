//Kevin Thomas Castañeda y Brayan Esteban Leon
import java.util.Random;
import java.util.Scanner;

public class partir3 { 
    
    public static void main(String[] args) {
        int[] arreglo = new int[cantDatos()];
        llenar(arreglo);

        System.out.println("Arreglo generado:");
        show(arreglo);

        int[][] grupos = agrupar(arreglo);
        ordenarGrupos(grupos);
        ordenarListaDeGrupos(grupos);

        System.out.println("\nGrupos ordenados:");
        mostrarGrupos(grupos);

        int[] finalOrdenado = unirYOrdenar(grupos);

        System.out.println("\nArreglo final (menor a mayor):");
        show(finalOrdenado);
    }

    public static int cantDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a procesar:");
        return scanner.nextInt();
    } 

    public static int[][] agrupar(int[] array) {
        int n = array.length;
        int numGrupos = (n % 2 == 0) ? n / 2 : (n / 2) + 1;

        int[][] grupos = new int[numGrupos][];
        int idx = 0;

        for (int i = 0; i < numGrupos; i++) {
            if (i == numGrupos - 1 && n % 2 != 0) {
                grupos[i] = new int[3];
                for (int j = 0; j < 3 && idx < n; j++) {
                    grupos[i][j] = array[idx++];
                }
            } else {
                grupos[i] = new int[2];
                for (int j = 0; j < 2 && idx < n; j++) {
                    grupos[i][j] = array[idx++];
                }
            }
        }
        return grupos;
    }

    public static void ordenarGrupos(int[][] grupos) {
        for (int[] g : grupos) {
            for (int i = 0; i < g.length - 1; i++) {
                for (int j = i + 1; j < g.length; j++) {
                    if (g[i] < g[j]) { 
                        int temp = g[i];
                        g[i] = g[j];
                        g[j] = temp;
                    }
                }
            }
        }
    }

    public static void ordenarListaDeGrupos(int[][] grupos) {
        for (int i = 0; i < grupos.length - 1; i++) {
            for (int j = i + 1; j < grupos.length; j++) {
                if (grupos[i][0] < grupos[j][0]) {
                    int[] temp = grupos[i];
                    grupos[i] = grupos[j];
                    grupos[j] = temp;
                }
            }
        }
    }

    public static int[] unirYOrdenar(int[][] grupos) {
        int total = 0;
        for (int[] g : grupos) total += g.length;

        int[] unido = new int[total];
        int idx = 0;

        for (int[] g : grupos) {
            for (int num : g) unido[idx++] = num;
        }
        for (int i = 0; i < unido.length - 1; i++) {
            for (int j = i + 1; j < unido.length; j++) {
                if (unido[i] > unido[j]) {
                    int temp = unido[i];
                    unido[i] = unido[j];
                    unido[j] = temp;
                }
            }
        }
        return unido;
    }

    public static void llenar(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(110) - 10;
        }
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void mostrarGrupos(int[][] grupos) {
        for (int[] g : grupos) {
            System.out.print("|");
            for (int i = 0; i < g.length; i++) {
                System.out.print(g[i]);
                if (i < g.length - 1) System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
    }

}
