
package operador.pkg0;

import java.util.Scanner;

public class Operador0 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       String medio,universidad;
       
       
        System.out.println("Digite titulo del nivel medio: ");
        medio = entrada.nextLine();
        System.out.println("Digite titulo del nivel Universitario: ");
        universidad= entrada.nextLine();
       
        if(medio.equals("Perito Contador") || universidad.equals("auditor")){
            System.out.println("Contrado");
        }else{
            System.out.println("No contratado");
        }
        
        
        
    }
    
}
