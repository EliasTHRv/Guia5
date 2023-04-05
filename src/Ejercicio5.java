
import java.util.Random;
import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es antisimétrica. Se
 * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 *
 * @author elias
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matriz[i][j] = aleatorio.nextInt(1,10) ;
                System.out.print("[" + matriz[i][j]+"]");
            }
            System.out.println("");
        }

        if ((matriz[0][1] == -matriz[1][0]) && (matriz[0][2] == -matriz[2][0]) && (matriz[1][2] == -matriz[2][1]))
        {
            System.out.println("La matriz es Antisimétrica.");
        } else
        {
            System.out.println("La matriz no es Antisimétrica.");
        }
    }
}
