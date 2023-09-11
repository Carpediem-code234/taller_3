/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulorectangulo;
import java.util.Scanner;

/**
 *
 * @author Jorge Mendoza
 */
public class TrianguloRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cateto = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer cateto: ");
        double cateto1 = cateto.nextDouble();

        System.out.print("Ingrese la longitud del segundo cateto: ");
        double cateto2 = cateto.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        double angulo1 = Math.toDegrees(Math.atan(cateto1 / cateto2));
        double angulo2 = 90 - angulo1;

        System.out.println("Hipotenusa: " + hipotenusa);
        System.out.println("Ángulo agudo 1: " + angulo1);
        System.out.println("Ángulo agudo 2: " + angulo2);
        
        cateto.close();
    }
    
}
