
import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada. Nota: Para resolver el ejercicio deberá
 * investigar cómo se utilizan las siguientes funciones de Java substring(),
 * Length() y Math.random().
 *
 * @author elias
 */
public class Extra6 {

    public static void main(String[] args) {

        String[] palabraS = new String[5];
        String[][] matriZ = new String[20][20];
        System.out.println("Llenado de palabras");
        vPalabra(palabraS);
        System.out.println("Rellenado de la sopa");
        llenaDoSopa(matriZ, palabraS);
        System.out.println("Completar espacios vacios de la sopa");
        finalSopa(matriZ);
        System.out.println("Mostrar sopa");
        mosTrarSopa(matriZ);

    }

    public static void vPalabra(String palabraS[]) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < palabraS.length; i++)
        {
            System.out.println("Ingrese una palabra min 3 caracteres y max 5 caracteres: ");
            palabraS[i] = leer.nextLine();
            while (palabraS[i].length() < 3 || palabraS[i].length() > 5)
            {
                System.out.println("Palabra invalida Ingrese una palabra min 3 caracteres y max 5 caracteres: ");
                palabraS[i] = leer.nextLine();
            }
        }

        for (int i = 0; i < palabraS.length; i++)
        {
            System.out.print(palabraS[i]+ " ");
        }
    }

    public static void llenaDoSopa(String matriZ[][], String palabraS[]) {
        int fila = (int) (Math.random() * 20);
        int columna = (int) (Math.random() * (21 - palabraS.length));

        for (int i = fila; i < palabraS.length; i++)
        {
            fila = (int) (Math.random() * 20);
            columna = (int) (Math.random() * (21 - palabraS.length));
            for (int j = columna; j < palabraS.length; j++)
            {

                matriZ[i][j] = palabraS[i];
            }
//            columna += pal.length() + 1;
        }
    }

    public static void finalSopa(String matriZ[][]) {
        for (int i = 0; i < 20; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                if (matriZ[i][j] == " " || matriZ[i][j] == "")
                {
                    matriZ[i][j] = "a";
                }
//                String.valueOf(((int) (Math.random() * 10) + 0))
            }
        }
    }

    public static void mosTrarSopa(String matriZ[][]) {
        for (int i = 0; i < 20; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                System.out.print(matriZ[i][j] + " ");
            }
        }
        System.out.println(" ");
    }
}
