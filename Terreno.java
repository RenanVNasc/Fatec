/*  Ler a largura e o comprimento de um terreno retangular e o preço do metro quadrado, calcular a área e o valor total do terreno. */

import java.util.Scanner;

public class Terreno {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        double largura, comprimento, precoMetro, area, valor;

        System.out.print ("Digite a medida da largura: ");
        largura = scanner.nextDouble();

        System.out.print ("Digite a medida do comprimento: ");
        comprimento = scanner.nextDouble();
        
        System.out.print ("Digite o preço do metro quadrado: R$ ");
        precoMetro = scanner.nextDouble();

        area = largura * comprimento;
        valor = area * precoMetro;

        System.out.printf ("Área do terreno: %.2f m² | Valor total do terreno: R$ %.2f", area, valor);

        scanner.close();
    }
}
