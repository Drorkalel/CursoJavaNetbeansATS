
package CursoJavaNetbeansATS;

import java.util.Scanner;           


public class OperadorIncrementoDecremento {
    public static void main(String[] args) {
        int x = 5, y;
        
       // x++; //Incrementa el valor de x en una unidad
       //x--; //Decrementa el valor de x en una unidad
       
       //y = x++; //primero hace la asignacion de y, y luego incrementa x en uno
       
       y = ++x;
       
        
        System.out.println(x);
        System.out.println(y);
    }
    
}
