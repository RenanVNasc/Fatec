/* Ler o valor em dólares e a cotação do dólar do dia, calcular e exibir o valor correspondente em reais. */

import java.util.Scanner;

public class ConvMoeda {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        double n, cotacao, nReais;

        System.out.print ("Digite o valor em dólar: ");
        n = scanner.nextDouble();

        System.out.print ("Digite a cotação do dólar atual: ");
        cotacao = scanner.nextDouble();

        nReais = n * cotacao;

        System.out.printf ("Valor digitado convertido em reais: R$ %.2f", nReais);
        
        scanner.close();
    }
    
}
