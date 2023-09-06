
package ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Ingrese el valor de C: ");
        double C = scanner.nextDouble();

 
        double discriminante = B * B - 4 * A * C;

        if (discriminante > 0) {
            double solucion1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double solucion2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son:");
            System.out.println("x1 = " + solucion1);
            System.out.println("x2 = " + solucion2);
        } else if (discriminante == 0) {
            double solucionUnica = -B / (2 * A);
            System.out.println("La solución es:");
            System.out.println("x = " + solucionUnica);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }

    }
    
}
