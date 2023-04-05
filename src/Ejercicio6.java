
import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
 * sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por 
 * teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números 
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 * @author elias
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] cuadraM = new int[3][3];
        Scanner leerN = new Scanner(System.in);
        
       
        System.out.println("Ingrese los valores del cuadrado mágico (1-9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                cuadraM[i][j] = leerN.nextInt();
                
          
                if (cuadraM[i][j] < 1 || cuadraM[i][j] > 9) {
                    System.out.println("Error: valor fuera de rango (1-9)");
                }
            }
        }
        
        int sumaMagica = cuadraM[0][0] + cuadraM[0][1] + cuadraM[0][2];
        
        for (int i = 0; i < 3; i++) {
            int sumaFila = cuadraM[i][0] + cuadraM[i][1] + cuadraM[i][2];
            if (sumaFila != sumaMagica) {
                System.out.println("No es un cuadrado mágico");
            }
        }
        
        for (int j = 0; j < 3; j++) {
            int sumaColumna = cuadraM[0][j] + cuadraM[1][j] + cuadraM[2][j];
            if (sumaColumna != sumaMagica) {
                System.out.println("No es un cuadrado mágico");
            }
        }
        
        int sumaDiagonal1 = cuadraM[0][0] + cuadraM[1][1] + cuadraM[2][2];
        int sumaDiagonal2 = cuadraM[0][2] + cuadraM[1][1] + cuadraM[2][0];
        if (sumaDiagonal1 != sumaMagica || sumaDiagonal2 != sumaMagica) {
            System.out.println("No es un cuadrado mágico");
        }
        
        System.out.println("Es un cuadrado mágico");
    }
}
