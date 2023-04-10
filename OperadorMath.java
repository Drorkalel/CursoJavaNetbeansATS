
package CursoJavaNetbeansATS;

import java.util.Scanner;

public class OperadorMath {
    public static void main(String[] args) {
        double raiz = Math.sqrt(9);
        
        double base = 5, exponente = 2; //Ejercicio de radicacion
        double resultado = Math.pow(5, 2); //Ejercicio de potenciacion
        
        float numero = 4.56f;
         int resultado1 = Math.round(numero); //Redondeo de decimales a entero, tambien se puede hacer con long
         
         double numero1 = Math.random();
        
        //int raiz =  (int)Math.sqrt(9); //se utilizaria este codigo cuando queramos resultados en enteros, pero lo logico
                                         //es usar double
        
        System.out.println(raiz);
        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(numero1);
        
    }
    
}
