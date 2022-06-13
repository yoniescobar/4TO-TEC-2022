
package ciclcowhile;

public class CiclcoWhile {

    public static void main(String[] args) {
       
        int i=0;
        
        System.out.println("forma Ascendente");
        while(i<=5){
            System.out.print(i+"  "); //0 1 2 3 4 5
            i++;
        }
        System.out.println("\nForma descendete");
        
        int j=5;
        while(j>=0){
            System.out.print(j+"  "); //5 4 3 2 1 0
            j--;
        }
    }
    
}
