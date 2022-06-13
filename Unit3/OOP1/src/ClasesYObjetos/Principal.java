
package ClasesYObjetos;

public class Principal {
    public static void main(String[] args) {
        Auto A1 = new Auto();
        A1.placa="PXH123";
        A1.color ="Rojo";
        A1.precio = 35700.89;
        A1.marca  = "Toyota";
        A1.stock = 12;

        System.out.println(A1.toString());
        
        Auto A2 = new Auto();
        A2.placa = "YUN456";
        A2.color = "Azul";
        A2.precio= 50000;
        A2.marca ="Honda";
        A2.stock = 10;
        
        System.out.println(A2.toString());
        A2.arrancar();
    }
}
