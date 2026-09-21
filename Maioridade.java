/* Ler o ano de nascimento e o ano atual, calcular a idade da pessoa e exibir se ela é maior de idade (18 anos ou mais) ou menor de idade. */

import java.util.Scanner;
import java.time.LocalDate;

public class Maioridade {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        int anoNasc, idade, anoAtual = LocalDate.now().getYear();

        System.out.print ("Digite o ano de nascimento: ");
        anoNasc = scanner.nextInt();

        idade = anoAtual - anoNasc;

        if (idade >= 18) {
            System.out.printf ("Maior de idade (%d anos).", idade);
        }
        else {
            System.out.printf ("Menor de idade (%d anos).", idade);
        }
        
        scanner.close();
    }
}


/*
import java.util.Scanner;

public class Maioridade {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        int anoNasc, anoAtual, idade;

        System.out.print ("Digite o ano de nascimento: ");
        anoNasc = scanner.nextInt();

        System.out.print ("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        if (anoNasc > anoAtual) {
            System.out.println ("Dados inválidos: Ano de nascimento digitado é maior que o ano atual.");
        }
        else {
            idade = anoAtual - anoNasc;

            if (idade >= 18) {
                System.out.println ("Maior de idade.");
            }
            else {
                System.out.println ("Menor de idade.");
            }
        }

        scanner.close();
    }
}

*/
