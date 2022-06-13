
package ejerciciowhile1;

import java.util.Scanner;


public class EjercicioWhile1 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
       int numero,suma=0; 
       char opcion='s';
       
       
       while(opcion!='n'){
           System.out.print("Digite un numero: ");
           numero = entrada.nextInt();
           System.out.print("¿Deseas continuar s/n ': ");
           opcion = entrada.next().charAt(0); //qui es para leer letra
           
           suma = suma + numero;
       }
       
        System.out.println("La suma es: "+suma);
       
       
    }
    
}
