
package lab3.programa1;
import java.util.Scanner;

public class Lab3Programa1 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int numero,cm,dm,um,c,d,u;
       
        System.out.print("Ingrese un numero que tenga 6 digitos: ");  //146075
        numero = entrada.nextInt();
        
        //Hacer calculos o procesos
        cm = numero / 100000;       // 8
        numero = numero % 100000;   //72021
        dm = numero / 10000;        //7
        numero = numero % 10000;   //2021
        um = numero / 1000;        //2
        numero = numero % 1000;   //021
        c = numero/100;           //0
        numero= numero % 100;     //21
        d = numero / 10;          //2
        numero = numero % 10;     //1
        u = numero; //1
                
        if(cm==0){ //evualuar centenas de millar cm 
            System.out.println("Número cero: "+cm);
        }else if(cm%2!=0){
             System.out.println("Número Impar: "+cm);
        }else{
            System.out.println("Número Par: "+cm);
        }
        
        if(dm==0){ //evualuar decenas de millar dm
            System.out.println("Número cero: "+dm);
        }else if(dm%2!=0){
             System.out.println("Número Impar: "+dm);
        }else{
            System.out.println("Número Par: "+dm);
        }
        
        if(um==0){ //evualuar unidades de millar um
            System.out.println("Número cero: "+um);
        }else if(um%2!=0){
             System.out.println("Número Impar: "+um);
        }else{
            System.out.println("Número Par: "+um);
        }
        
        if(c==0){ //evualuar centenas c
            System.out.println("Número cero: "+c);
        }else if(c%2!=0){
             System.out.println("Número Impar: "+c);
        }else{
            System.out.println("Número Par: "+c);
        }
        
         if(d==0){ //evualuar decenas d
            System.out.println("Número cero: "+d);
        }else if(d%2!=0){
             System.out.println("Número Impar: "+d);
        }else{
            System.out.println("Número Par: "+d);
        }
         
         if(u==0){ //evualuar decenas d
            System.out.println("Número cero: "+u);
        }else if(u%2!=0){
             System.out.println("Número Impar: "+u);
        }else{
            System.out.println("Número Par: "+u);
        }
        

    }
    
}
