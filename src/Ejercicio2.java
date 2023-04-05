
import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un
 * número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 * 
 * @author elias
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int N;
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        N= leerN.nextInt();
        int vectoR[] = new int[N];
        
        for (int i = 0; i < vectoR.length; i++){
            vectoR[i]=(int)(Math.random()*20);
        }
        System.out.println("Ingrese un numero para buscar en el vector: ");
        int nuM = leerN.nextInt();
        int aux, cont;
        aux = 0;
        cont=0;
         for (int i = 0; i < vectoR.length; i++){
             if (nuM==vectoR[i])
             {
                 cont += cont;
                aux = i;
                System.out.println("La posicion del numero es: " + aux);
             }
        }
    }
}
