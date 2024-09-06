
package ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
       LocalDate currentDate = LocalDate.now();
        int diaActual = currentDate.getDayOfMonth();
        int mesActual = currentDate.getMonthValue();
        int annoActual = currentDate.getYear();

        int edad = annoActual - anno;

        if (mesActual < mes) {
            edad--;
        } else if (mesActual == mes && diaActual < dia) {
            edad--;
        }

        return "Usted tiene " + edad + " años";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
