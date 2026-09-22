/* Ler o valor de vendas do mês de um vendedor e o valor da meta estabelecida. Se a meta for atingida, calcular uma comissão de 8% sobre as vendas; caso contrário, calcular uma comissão de 3%. Exibir o valor da comissão. */

import java.util.Scanner;

public class Comissao {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        double vendas, meta, comissao;

        System.out.print ("Digite o valor de vendas do mês: ");
        vendas = scanner.nextDouble();

        System.out.print ("Digite o valor da meta: ");
        meta = scanner.nextDouble();

        if (vendas >= meta) {
            comissao = vendas * 0.08;
        }
        else {
            comissao = vendas * 0.03;
        }
        
        System.out.printf ("Comissão: R$ %.2f", comissao);

        scanner.close();
    }
}
