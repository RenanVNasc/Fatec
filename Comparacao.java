/* Ler dois números e exibir qual deles é o maior, ou se são iguais. */

import java.util.Scanner;

public class Comparacao {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        double n1, n2;

        System.out.print ("Digite um número: ");
        n1 = scanner.nextDouble();

        System.out.print ("Digite outro número: ");
        n2 = scanner.nextDouble();

        if (n1 > n2) {
            System.out.println (n1 + " > " + n2);
        }
        else if (n2 > n1) {
            System.out.println (n2 + " > " + n1);
        }
        else {
            System.out.println (n1 + " = " + n2);
        }

        scanner.close();
    }
}
