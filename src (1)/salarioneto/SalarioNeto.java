/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarioneto;
import java.util.Scanner;

/**
 *
 * @author Camilo Mendoza
 */
public class SalarioNeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las horas semanales trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el salario por hora: ");
        double salarioHora = scanner.nextDouble();

        double salarioBruto;
        double salarioNeto;

        if (horasTrabajadas < 38) {
            salarioBruto = horasTrabajadas * salarioHora;
        } else {
            int horasExtras = horasTrabajadas - 38;
            salarioBruto = (38 * salarioHora) + (horasExtras * salarioHora * 1.5);
        }

        if (salarioBruto <= 750) {
            salarioNeto = salarioBruto;
        } else {
            salarioNeto = salarioBruto - (salarioBruto * 0.1);
        }

        System.out.println("Salario neto semanal: " + salarioNeto);
        
        scanner.close();
    }
    
}
