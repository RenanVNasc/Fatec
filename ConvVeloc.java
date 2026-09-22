/* Ler uma velocidade em quilômetros por hora, converter para metros por segundo e exibir o resultado. */

import java.util.Scanner;

public class ConvVeloc {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        double kmh, ms;

        System.out.print ("Digite a velocidade em km/h: ");
        kmh = scanner.nextDouble();
        
        ms = kmh / 3.6;

        System.out.println (kmh + " km/h = " + ms + " m/s");

        scanner.close();
    }
}