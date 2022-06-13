/*
Ingrese un cantidad cuatro cifras: 7531

Unidad de millar: 7
Centenas: 5
decenas: 3
unidades 1
*/

package ejerciciomodulo;

import java.util.Scanner;

public class EjercicioModulo {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      int num,um,c,d,u;
      
        System.out.print("Ingrese un numero de Cuatro cifras: ");
        num = entrada.nextInt(); //8356
        
        um = num/1000; // aqui obtengo el valor 8
        num = num %1000; // aqui obtengo el resto 356
        c   = num /100; // aqui obtengo el valor de 3
        num = num % 100; //aqui obtengo el resto 56
        d   = num /10; // aqui obtengo el 5
        num = num % 10; // aqui obtengo el resto 6
        u = num; // aqui obtengo 6 de unidades
        
        System.out.println("Unidades de millar: "+um);
        System.out.println("Centenas: "+c);
        System.out.println("Decenas: "+d);
        System.out.println("Unidades: "+u);
        
        
        
    }
    
}
