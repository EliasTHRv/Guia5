/**
 *
 * @author elias
 */
import java.util.Random;
import java.util.Scanner;

public class Extra6 {
     public static void main(String[] args) {
        String palabra;
        int n = 4;
        int m = 10;
        int num;

        Scanner read = new Scanner(System.in);

        String matriz[][] = new String[n][m];

        num = (int) (Math.random() * 10+1);

        for (int i = num; i < n; i++) {
            do {
                System.out.println("ingrese una frase: ");
                palabra = read.next();
            } while (palabra.length() < 2 || palabra.length() > 6);

            for (int j = 0; j < m; j++) {
                matriz[i][j] = palabra.substring(j);
                if (matriz[i][j]) {
                    
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == "" || matriz[i][j] == " ") {
                    matriz[i][j] = "0";
                }
            }
        }

        System.out.println("");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}