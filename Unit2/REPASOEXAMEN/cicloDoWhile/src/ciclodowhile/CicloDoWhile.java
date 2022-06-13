
package ciclodowhile;

public class CicloDoWhile {

    public static void main(String[] args) {
        
        int i=1;
        
        System.out.println("Forma Ascendente: ");
        do{
            System.out.println(i);
            i++;
        
        }while(i<10);
        
        // aqui inicia la forma descendente
        int j=10;
        
        System.out.println("Forma Descendente");
        
        do{
            System.out.println(j);
            j=j-2;
        }while(j>=0);
        
        
        
        
        
    }
    
}
