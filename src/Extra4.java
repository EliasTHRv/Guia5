
import java.util.Scanner;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son: 
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15% 
 * Primer Integrador 25% Segundo
 * integrador 50% Una vez cargadas las notas, se calcula el promedio y se guarda
 * en el arreglo. Al final del programa los profesores necesitan obtener por
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
 * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 *
 * @author elias
 */
public class Extra4 {

    public static void main(String[] args) {
       
        double[] vecT = new double[10];
        int[][] matriZ = new int[10][4];
        relleN( matriZ, vecT);
        System.out.println("    ");
        anLv(vecT);
//        mosTra(matriZ);
    }
    
    
    public static void relleN(int matriZ[][],double vecT[]) {
         Scanner leerN = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print("Rellene las nota de los alumnos, P1,P2, i1, i2" + "["+i+"]"+"["+j+"]" );
             
                  matriZ[i][j] = leerN.nextInt();
            if (matriZ[i][j] < 0 || matriZ[i][j] > 10)
            {
                System.out.println("La nota ingresada es inválida vuelva a intentarlo.");
                matriZ[i][j] = leerN.nextInt();
            }
             vecT[i] = ((matriZ[i][0] * 0.10) + (matriZ[i][1] * 0.15) + (matriZ[i][2] * 0.25) + (matriZ[i][3] * 0.5));
            }
        }
       
    }
    public static void anLv(double vecT[]){
        int con1 = 0;
        int con2 = 0;
       
        for (int i = 0; i < vecT.length; i++)
        {
            if (vecT[i]>=7)
            {
                con1++;
            } else
            {
                con2++;
            }
            
        }
        System.out.println("Los aprobados: " + con1);
        System.out.println("Los desaprobados" + con2);
    }
    
    
//   public static void mosTra(int matriZ[][]){
//       for (int i = 0; i < 10; i++)
//       {
//           for (int j = 0; j < 4; j++)
//           {
//               System.out.print("[" +matriZ[i][j] + "]");
//           }
//       }
//   }
    
}
