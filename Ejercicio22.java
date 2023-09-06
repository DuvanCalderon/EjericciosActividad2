
package ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el salario básico por hora: ");
        double salarioPorHora = scanner.nextDouble();
        
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int horasTrabajadas = scanner.nextInt();

        
        double salarioMensual = salarioPorHora * horasTrabajadas;

        
        if (salarioMensual > 450000) {
            System.out.println("Nombre del empleado: " + nombre);
            System.out.println("Salario mensual: $" + salarioMensual);
        } else {
            System.out.println("Nombre del empleado: " + nombre);
        }
    }
}

   
    
