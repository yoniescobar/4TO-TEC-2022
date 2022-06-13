
package notaestudiante;

import java.util.Scanner;

public class NotaEstudiante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declarando variables
        int nota1,nota2,nota3,nota4,promedio;
        String resultado="",nombre,curso;
        
        //Ingresar datos
        System.out.print("Digite el nombre del Estudiante: ");
        nombre = entrada.nextLine();
        System.out.print("Digite el Curso: ");
        curso = entrada.nextLine();
        System.out.print("Nota 1: ");
        nota1 = entrada.nextInt();
        System.out.print("Nota 2: ");
        nota2 = entrada.nextInt();
        System.out.print("Nota 3: ");
        nota3 = entrada.nextInt();
        System.out.print("Nota 4: ");
        nota4 = entrada.nextInt();
        
        //procesos --- calculos
        
        promedio = (nota1+nota2+nota3+nota4)/4;
       /*
        if(promedio>=0 && promedio<=59){
            resultado = "Deficiente";
        }else if(promedio>=60 && promedio<=70) {
             resultado = "Regular";
        }else if(promedio>=71&& promedio<=80) {
             resultado = "Bueno";
        }else{
             resultado = "Excelente";
        }*/
        
         if(promedio<=59){
           resultado = "Deficiente";
         }else if(promedio<=70){
           resultado = "Regular";
         }else if(promedio<=80){
           resultado = "Bueno";
         }else{
            resultado = "Excelente";
         }
       
        //Mostrar datos
        System.out.println("======  Resultados  =========");
        System.out.println("Promedio: "+promedio);
        System.out.println("Resultado: "+resultado);
        
        
        
    }
    
}
