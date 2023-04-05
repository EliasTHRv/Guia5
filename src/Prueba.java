
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
public class Prueba {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int N = leer.nextInt();
        
        System.out.println("Ingrese el tamaño del vector");
        int[] vector = new int[N];
        
        for (int i = 0; i < vector.length; i++) {
           vector[i] = (int)(Math.random()*20);
        }
       
        
    }
    }
}
