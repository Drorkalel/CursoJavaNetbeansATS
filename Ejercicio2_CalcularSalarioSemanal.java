
/*Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas
semanales trabajadas y de su salario por hora*/

package CursoJavaNetbeansATS;

import java.util.Scanner;


public class Ejercicio2_CalcularSalarioSemanal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double salarioMes, salarioHora, salarioSemana;
        
        System.out.print("Digite su salario base mensual: ");
        
        salarioMes = entrada.nextDouble(); // entrada de datos
        salarioHora = salarioMes/240;
        salarioSemana = salarioHora*48;
        
        System.out.println("\n Su salario semanal es: " + salarioSemana); // salidad de datos
        System.out.println("\n Su salario por hora es: " + salarioHora);
        
    }
    
}
