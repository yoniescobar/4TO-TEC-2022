
package repasometodos;

public class RepasoMetodos {

    public static void main(String[] args) {
        saludar("Yoni",18);
        
       int mayor = encontrarMayor(10,15,11);
        System.out.println("\nMayor: "+mayor);

       String cadena= verificarEdad(25);
       System.out.println("Respuesta: "+cadena);
        
       int[] notas ={60,65,45,45,80}; // 6 estudiantes cuantos ganaron y cuantos perdieron
       int cantGanaron =  contarGanaron(notas);
        System.out.println("=====>La Cantidad de Estudiantes que Ganaron es: "+cantGanaron);
       int cantPerdieron =  cantPerdieron(notas); 
         System.out.println("=====>La Cantidad de Estudiantes que Perdieron es: "+cantPerdieron);
    
    }
    
    public static void saludar(String nombre, int edad){
        System.out.println("\nHola Estudiante: "+nombre);
        System.out.println("Edad es: "+edad);
    
    }
    public static int encontrarMayor(int num1, int num2, int num3){
        int mayor = 0;
        
        if(num1>num2 && num2>num3){
          mayor = num1;
        }else if(num2>num1 && num2>num3){
          mayor = num2;
        }else{
          mayor = num3;
        }
        
        return mayor;
    }
    public static String verificarEdad(int edad){
        
        if(edad>18){
            return "Eres Mayor de Edad: ";
        }else{
            return "Eres Menor de Edad: ";
        } 
    }
    public static int  contarGanaron(int vecNotas[]){
         int contGanaron=0;
        
         for(int i=0;i<vecNotas.length-1;i++){ //es para rrecorre el vector
             if(vecNotas[i]>=60){ //para saber cuantos ganaron
              contGanaron++;
             }
         }
         return contGanaron;
    }
    public static int  cantPerdieron(int vecNotas[]){
         int contPerdieron=0;
        
         for(int i=0;i<vecNotas.length-1;i++){ //es para rrecorre el vector
             if(vecNotas[i]<60){ //para saber cuantos ganaron
              contPerdieron++;
             }
         }
         return contPerdieron;
    }
}
