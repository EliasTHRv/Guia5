
import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 *
 * @author elias
 */
public class Extra2 {

    public static void main(String[] args) {
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leerN.nextInt();
        int[] vec1 = new int[n];
        int[] vec2 = new int[n];
       
        
        for (int i = 0; i < vec1.length; i++)
        {
            System.out.print("Ingrese elementos al vector: " + "[" + i + "]");
            vec1[i] = leerN.nextInt();
        }
        
        for (int i = 0; i < vec2.length; i++)
        {
            System.out.print("Ingrese elementos al vector: " + "[" + i + "]");
            vec2[i] = leerN.nextInt();
        }

//        for (int i = 0; i < vec1.length; i++)
//        {
//            System.out.println(vec1[i]);
//        }
//        for (int i = 0; i < vec2.length; i++)
//        {
//            System.out.println(vec2[i]);
//        }
boolean com = false;
do
        {            
            for (int i = 0; i < vec1.length; i++)
        {
          com =(vec1[i]!=vec2[i]);
           if (com != true)
        {
            System.out.println("Los vectores son iguales");
        } else {
             System.out.println("Los vectores no son iguales");
             break;
         }
        }
        } while (com==false);
  
       
          
        
        
        

        
    }    
}
