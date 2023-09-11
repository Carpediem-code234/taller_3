/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resultadoselecciones;

/**
 *
 * @author Camilo Mendoza
 */
public class ResultadosElecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] votaciones = {
            {194, 48, 206, 45},
            {180, 20, 320, 16},
            {221, 90, 140, 20},
            {432, 50, 821, 14},
            {820,61,946, 18}
        };
        int[] fila = {1,2,3,4,5};
        int totalVotos = 0;
        int[] totalVotosCandidato = new int[votaciones[0].length];
        double[] porcentajeVotosCandidato = new double[votaciones[0].length];

        for (int i = 0; i < votaciones.length; i++) {
            double totalVotosComuna = 0;
            for (int j = 0; j < votaciones[i].length; j++) {
                totalVotosComuna += votaciones[i][j];
                totalVotosCandidato[j] += votaciones[i][j];
            }
            totalVotos += totalVotosComuna;

            int mayorVotosComuna = 0;
            for (int j = 0; j < votaciones[i].length; j++) {
                double porcentajeVotosCandidatoComuna = (votaciones[i][j] * 100) / totalVotosComuna;
                porcentajeVotosCandidato[j] += porcentajeVotosCandidatoComuna;
                if (votaciones[i][j] > mayorVotosComuna) {
                    mayorVotosComuna = votaciones[i][j];
                }
            }
        }

        int mayorVotosCandidato = 0;
        int indiceCandidatoMasVotado = 0;
        for (int i = 0; i < totalVotosCandidato.length; i++) {
            if (totalVotosCandidato[i] > mayorVotosCandidato) {
                mayorVotosCandidato = totalVotosCandidato[i];
                indiceCandidatoMasVotado = i;
            }
        }

        double mayorPorcentajeVotosCandidato = 0;
        double indiceComunaMayorPorcentaje = 0;
        for (int i = 0; i < porcentajeVotosCandidato.length; i++) {
            if (porcentajeVotosCandidato[i] > mayorPorcentajeVotosCandidato) {
                mayorPorcentajeVotosCandidato = porcentajeVotosCandidato[i];
                indiceComunaMayorPorcentaje = i;
            }
        }

        System.out.println("Tabla de votaciones:");
        System.out.println("Comuna Candidato_A Candidato_B Candidato_C Candidato_D");
        
       
        for (int i = 0; i < votaciones.length; i++) {
            System.out.print("   "+ fila[i]);
            for (int j = 0; j < votaciones[i].length; j++) {
                
                System.out.print("      " + votaciones[i][j] + "\t");
                
            }
            System.out.println();
           
        }

        System.out.println("Total de votos recibidos por cada candidato:");
        for (int i = 0; i < totalVotosCandidato.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + totalVotosCandidato[i]);
        }

        System.out.println("Porcentaje de votación de cada candidato:");
        for (int i = 0; i < porcentajeVotosCandidato.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + porcentajeVotosCandidato[i] + "%");
        }

        System.out.println("Candidato más votado: Candidato " + (indiceCandidatoMasVotado + 1));

        System.out.println("Comuna con mayor porcentaje de votación: Comuna " + (indiceComunaMayorPorcentaje + 1));
    }
    
}
