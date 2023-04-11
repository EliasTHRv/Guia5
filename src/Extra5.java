
import java.util.Random;
import java.util.Scanner;


/**
 *Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios 
 * y muestre la suma de sus elementos.
 * @author elias
 */
public class Extra5 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese filas");
        int n = leer.nextInt();
        System.out.println("Ingrese columnas");
        int m = leer.nextInt();
    
        int[][] matriZ = new int[n][m];
        relleN( matriZ,n,m);
        System.out.println("    ");

    }
    
    public static void relleN(int matriZ[][], int n, int m){
    Random alea = new Random();
    int aux = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                matriZ[i][j]= alea.nextInt(0,10);
                
                aux+=matriZ[i][j];
                
            }
            System.out.println("El resultado de la fila: "+"[" + i+"]"+ aux);
            System.out.println(" ");
            aux=0;
        }
        
    }
}
