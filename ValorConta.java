/* Ler o consumo em kWh registrado no mês. Se o consumo for maior que 200 kWh, aplicar tarifa de R$ 0,95 por kWh; caso contrário, aplicar tarifa de R$ 0,75 por kWh. Calcular e exibir o valor total da conta. */

import java.util.Scanner;

public class ValorConta {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        double consumo, valor;

        System.out.print ("Digite o consumo registrado em kWh: ");
        consumo = scanner.nextDouble();

        if (consumo > 200) {
            valor = consumo * 0.95;
        }
        else {
            valor = consumo * 0.75;
        }

        System.out.printf ("Valor da conta: R$ %.2f", valor);

        scanner.close();
    }
}
