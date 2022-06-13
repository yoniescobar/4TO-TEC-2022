
package operadoresaritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
     //Operadores Aritmeticos son + , -, *, / % modulo
        Scanner entrada = new Scanner(System.in);  //0. Crear objeto Entrada
        
        int n1,n2,suma,resta,producto,division,modulo; // 1. declarar variables
        
        System.out.print("Ingrese el dato de n1: ");  //2.entrada datos
        n1 = entrada.nextInt();
        System.out.print("Ingrese el dato de n2: ");
        n2 = entrada.nextInt();
        
        suma = n1 + n2;                                //3. procesos -- calculos
        resta = n1 - n2;
        producto = n1*n2;
        division = n1/n2;
        modulo = n1 % n2; //modulo (lo que sobra de la division)
        
        System.out.println("\nLa suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("El Mutliplicacion es: "+producto);
        System.out.println("La division es: "+division);
        System.out.println("El modulo es: "+ modulo);
        
        
    }
    
}
