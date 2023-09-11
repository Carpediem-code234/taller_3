/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventasdia;

/**
 *
 * @author Jorge Mendoza
 */
public class VentasDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] codigoProductos = {1, 2, 3, 4, 5}; // Ejemplo de códigos de productos
        double[] valorVenta = {10.50, 15.75, 8.99, 12.50, 9.99}; // Ejemplo de valores de venta
        int[] cantidadUnidades = {20, 15, 30, 25, 18}; // Ejemplo de cantidad de unidades vendidas

        int totalProductos = codigoProductos.length;
        double totalIngresos = 0;
        int maxUnidadesVendidas = cantidadUnidades[0];
        double maxValorVenta = valorVenta[0];

        for (int i = 0; i < totalProductos; i++) {
            totalIngresos += valorVenta[i] * cantidadUnidades[i];
            if (cantidadUnidades[i] > maxUnidadesVendidas) {
                maxUnidadesVendidas = cantidadUnidades[i];
            }
            if (valorVenta[i] > maxValorVenta) {
                maxValorVenta = valorVenta[i];
            }
        }

        System.out.println("Total productos vendidos en el día: " + totalProductos);
        System.out.println("Total ingresos por ventas del día: " + totalIngresos);
        System.out.println("Producto más vendido: " + maxUnidadesVendidas);
        System.out.println("Producto más costoso vendido: " + maxValorVenta);
    }
    
}
