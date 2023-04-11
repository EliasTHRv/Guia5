
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author elias
 */
public class Eje4_2 {

    public static void main(String[] args) {

        cargarNotas();

    }

    public static void cargarNotas() {
        double notaFinal;
        notaFinal = 0;
        for (int i = 1; i <= 10; i++)
        {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la nota del primer TP del " + i + "° alumno: ");
            int notaTp1 = leer.nextInt();
            if (notaTp1 < 0 || notaTp1 > 10)
            {
                System.out.println("La nota ingresada es inválida vuelva a intentarlo.");
                notaTp1 = leer.nextInt();
            }

            System.out.println("Ingrese la nota del segundo TP del " + i + "° alumno: ");
            int notaTp2 = leer.nextInt();
            if (notaTp2 < 0 || notaTp2 > 10)
            {
                System.out.println("La nota ingresada es inválida vuelva a intentarlo.");
                notaTp2 = leer.nextInt();
            }
            System.out.println("Ingrese la nota del primer parcial del " + i + "° alumno: ");
            int notaParcial1 = leer.nextInt();
            System.out.println("Ingrese la nota del segundo parcial del " + i + "° alumno: ");
            int notaParcial2 = leer.nextInt();

            notaFinal = ((notaTp1 * 0.10) + (notaTp2 * 0.15) + (notaParcial1 * 0.25) + (notaParcial2 * 0.5));
            System.out.println("Nota final del alumno: "+"0"+notaFinal );
        }

    }
}