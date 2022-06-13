
package raizypotencia;

import java.util.Scanner;


public class RaizYPotencia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double num,r1,r2;
        
        System.out.println("Ingrese un numero entero positivo: ");
        num = entrada.nextDouble();
        
        r1 = Math.sqrt(num);
        r2 = Math.pow(num,3);
        
        
        System.out.println("La raiz cuadra es: "+r1);
        System.out.println("El numero elevado a la 3 es : "+r2);
        
    }
    
}
