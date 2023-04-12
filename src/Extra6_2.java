
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
public class Extra6_2 {
public static void main(String[] args) {

        // Crear matriz de 20 x 20
        char[][] sopa = new char[20][20];

        // Pedir al usuario que ingrese 5 palabras
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese palabra " + (i+1) + ": ");
            palabras[i] = sc.nextLine();
            // Verificar que la palabra tenga entre 3 y 5 caracteres
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("Palabra inválida, debe tener entre 3 y 5 caracteres. Ingrese de nuevo: ");
                palabras[i] = sc.nextLine();
            }
        }

        // Elegir aleatoriamente la fila en la que se colocarán las palabras
        int fila = (int) (Math.random() * 20);

        // Colocar las palabras en la fila elegida
        int x = (int) (Math.random() * (21 - palabras.length)); // posición inicial en x
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                sopa[fila][x+j] = palabra.charAt(j);
            }
            x += palabra.length() + 1; // dejar un espacio entre palabras
        }

        // Rellenar espacios no utilizados con números aleatorios del 0 al 9
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) ((int) (Math.random() * 10) + '0');
                }
            }
        }

        // Imprimir sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
