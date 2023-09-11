/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notacionhora;
import java.util.Scanner;
/**
 *
 * @author CAMILO MENDOZA
 */
public class NotacionHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner eleccion = new Scanner(System.in);

        System.out.print("Ingrese la hora en notación de 24 horas (hh:mm): ");
        String hora24 = eleccion.next();

        String[] partes = hora24.split(":");
        int hora = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        String periodo = (hora < 12) ? "am" : "pm";
        hora = (hora > 12) ? hora - 12 : hora;
        
        System.out.println("La hora en notación de 12 horas es: " + hora + ":" + String.format("%02d", minutos) + " " + periodo);

        eleccion.close();
    }
    
}
