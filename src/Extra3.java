
import java.util.Random;
import java.util.Scanner;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 *
 * @author elias
 */
public class Extra3 {

    public static void main(String[] args) {
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leerN.nextInt();
        int[] vec1 = new int[n];
        rellenarV(n, vec1);
        mostraV(n, vec1);
        rellenarV(n, vec1);
        System.out.println("");
        mostraV(n, vec1);
        System.out.println("");
    }
    
    public static void rellenarV(int n, int vec1[]) {
        Random alea = new Random();
        for (int i = 0; i < n; i++)
        {
            vec1[i] = alea.nextInt(-10, 0);
        }
    }
    
    public static void mostraV(int n, int vec1[]) {
        for (int i = 0; i < n; i++)
        {
            System.out.print("[" + vec1[i] + "]");
        }
    }
}
