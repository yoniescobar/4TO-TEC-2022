
package ecuacionsegundogrado;

import java.util.Scanner;

public class EcuacionSegundoGrado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c,resultado1,resultado2;
        
        System.out.print("Ingrese el valor de a: ");
        a = entrada.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = entrada.nextInt();
        System.out.print("Ingrese el valor de c: ");
        c = entrada.nextInt();
        
        resultado1= (-b + Math.sqrt(Math.pow(b, 2)-(4*a*c))) / (2*a);
        resultado2= (-b - Math.sqrt(Math.pow(b, 2)-(4*a*c))) / (2*a);
        
        System.out.println("La respuesta x1: "+resultado1);
        System.out.println("La respuesta x2: "+resultado2);
    }
    
}
