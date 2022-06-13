
package problema.pkg3;

import java.util.Scanner;

public class Problema3 {
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); //1. Objeto entrada
       
       float pies,yardas,pulgadas,centimetros,metros; //2. Declarar Variables
       
        System.out.print("Ingrese número de Pies: ");
        pies = entrada.nextFloat();   //3. Ingreso de datos
        
                            //4. hacer los caculculos --- procesos
       yardas = pies/3;
       pulgadas = pies*12;
       centimetros = pulgadas * 2.54f;
       metros = centimetros /100;
       
                            //5. Salida de datos
        System.out.println("\n\n========= Conversion de Datos ==========");
        System.out.println("Yardas: "+yardas);
        System.out.println("Pulgadas: "+pulgadas);
        System.out.println("Centimetros: "+centimetros);
        System.out.println("Metros: "+metros);

    }
    
}
