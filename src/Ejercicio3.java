
import java.util.Random;
import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 * @author elias
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int N;
        Random Aletorio = new Random();
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        N = leerN.nextInt();
        int vectoR[] = new int[N];
//        String vectorS[]=new String[N];

        for (int i = 0; i < vectoR.length; i++)
        {
            vectoR[i] = Aletorio.nextInt(99999);
        }

//        for (int i = 0; i < vectoR.length; i++)
//        {
//            System.out.print(vectoR[i]);
//        }
        int uno, dos, tres, cuatro, cinco;
        uno = 0;
        dos = 0;
        tres = 0;
        cuatro = 0;
        cinco = 0;

//            Integer.toString(vectoR[i]).length();
        for (int i = 0; i < vectoR.length; i++)
        {
            if (vectoR[i] > 9999)
            {
                cinco++;
            } else if (vectoR[i] > 999)
            {
                cuatro++;
            } else if (vectoR[i] > 99)
            {
                tres++;
            } else if (vectoR[i] > 9)
            {
                dos++;
            }else if (vectoR[i]>=0){
                uno++;
            }
        }
        System.out.println("tenemos "+cinco+" numeros de 5 digitos" );
        System.out.println( "tenemos "+cuatro+" numeros de 4 digitos");
        System.out.println("tenemos "+tres+" numeros de 3 digitos" );
        System.out.println("tenemos "+dos+" numeros de 2 digitos" );
        System.out.println("tenemos "+uno+" numeros de 1 digitos");
    }
    

}
