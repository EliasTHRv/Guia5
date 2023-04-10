
import java.util.Scanner;

/**
 *Realizar un algoritmo que calcule la suma de todos los elementos de un 
 * vector de tamaño N, con los valores ingresados por el usuario.
 * @author elias
 */
public class Extra1 {
    public static void main(String[] args) {
        int aux;
        aux =0;
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leerN.nextInt();
        int[] vec1 = new int[n];
        
        
        System.out.println("  ");
        //rellenado
        for (int i = 0; i < vec1.length; i++)
        {
            System.out.print("Ingrese elementos al vector: " +"["+ i + "]");
            vec1[i]= leerN.nextInt();
        }
        //suma de vector
        for (int i = 0; i < vec1.length; i++)
        {
            aux +=vec1[i];
//            aux = aux + vec1[i];
        }
        System.out.println("La suma de todos los elementos del vector es: " + aux);
    }
}
