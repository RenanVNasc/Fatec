/* Ler o peso e a altura de uma pessoa, calcular o IMC e exibir se o resultado indica abaixo do peso (IMC < 18,5), peso normal (18,5 a 24,9) ou sobrepeso (IMC ≥ 25). */

import java.util.Scanner;

public class IMC {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        double altura, peso, IMC;

        System.out.print ("Digite a altura em metros: ");
        altura = scanner.nextDouble();

        System.out.print ("Digite o peso em kg: ");
        peso = scanner.nextDouble();

        IMC = peso / Math.pow(altura, 2);

        if (IMC < 18.5) {
            System.out.println ("Abaixo do peso.");
        }
        else if (IMC >= 25) {
            System.out.println ("Sobrepeso.");
        }
        else {
            System.out.println ("Peso normal.");
        }

        scanner.close();
    }
}
