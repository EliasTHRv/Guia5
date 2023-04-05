
import java.util.Random;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author elias
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matRiz = new int[4][4];
        int[][] matTrans = new int[4][4];
        Random alea = new Random(100);

        for (int i = 0; i < matRiz.length; i++)
        {
            for (int j = 0; j < matRiz.length; j++)
            {
                matRiz[i][j] = alea.nextInt(-10,10);
            }

        }
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < matRiz.length; i++)
        {
            for (int j = 0; j < matRiz.length; j++)
            {
                System.out.print("[" + matRiz[i][j] + "]");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < matRiz.length; i++)
        {
            for (int j = 0; j < matRiz.length; j++)
            {
                matTrans[j][i] = matRiz[i][j];
            }

        }
        System.out.println("-----------------------");
        System.out.println("MATRIZ TRANSPUESTA");
        for (int i = 0; i < matTrans.length; i++)
        {
            for (int j = 0; j < matTrans.length; j++)
            {
                System.out.print("[" + matTrans[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
}
