/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximocomundivisor;
import java.util.Scanner;

/**
 *
 * @author Camilo Mendoza
 */
public class MaximoComunDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int mcd = euclides(numero1, numero2);

        System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd);
    }

    public static int euclides(int m, int n) {
        while (n != 0) {
            int resto = m % n;
            m = n;
            n = resto;
        }
        return m;
    }
    
}
