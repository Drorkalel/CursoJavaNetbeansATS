/*Ejercicio1: Hacer un programa que calcule e imprima la suma de 3 calificaciones*/

package CursoJavaNetbeansATS;

import java.util.Scanner;

public class Ejercicio1_CalcularSuma3Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float nota1, nota2, nota3, suma;
        
        System.out.print("Digite las 3 calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1 + nota2 + nota3; //Sumamos las 3 notas
        System.out.println("\n La suma es: " + suma);
    }
    
}
