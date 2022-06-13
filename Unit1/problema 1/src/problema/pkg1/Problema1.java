
package problema.pkg1;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); //1. coloca el objeto entrada
       
       float ancho,largo,costoMtsCuad,precioTotal,totalMtsCuad; //2. declarar variable
       
        System.out.print("Ingrese el Ancho del Terreno: ");
        ancho = entrada.nextFloat();  //3. Ingresar datos
        System.out.print("Ingrese el Largo del Terreno: ");
        largo = entrada.nextFloat();
        System.out.print("Ingrese el Costo del metro cuadrado del Terreno: ");
        costoMtsCuad = entrada.nextFloat();
        
                                    //4. procesos --- calculos
       totalMtsCuad = ancho * largo;
       precioTotal  = totalMtsCuad * costoMtsCuad;
                                                  //5. Salida
        System.out.println("\n ============= SALIDA =================");
        System.out.println("Total de metros cuadrados "+totalMtsCuad);
        System.out.println("El Costo total del terreno es: "+precioTotal);
                               
    }
    
}
