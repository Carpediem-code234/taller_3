/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaserie;
import java.util.Scanner;

/**
 *
 * @author CAMILO MENDOZA
 */
public class SumaSerie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cant = new Scanner(System.in);

        System.out.print("Ingrese un número entero n: ");
        int n = cant.nextInt();

        double suma = 0.0;
       
        for (int i = 1; i <= n; i++) {
            
            suma += (double) i / Math.pow(2, i);
            System.out.println( i + "/" + Math.pow(2, i));
            
        }
        
        System.out.println("La suma de la serie n/2^n es: " + suma);

        cant.close();
    }
    
}
