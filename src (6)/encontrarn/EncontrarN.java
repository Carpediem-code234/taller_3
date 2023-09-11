/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encontrarn;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author JORGE MENDOZA
 */
public class EncontrarN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner encontrar = new Scanner(System.in);

        System.out.print("Ingrese una cantidad: ");
        double cantidad = encontrar.nextDouble();

        int n = 1;
        double suma = 0.0;
        while (suma <= cantidad) {
            suma += n;
            n++;
        }

        System.out.println("El número natural N más pequeño cuya suma de los N primeros números excede la cantidad es: " + (n - 1));

        encontrar.close();
     
    }
    }
    

