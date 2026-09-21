/* Ler o número total de aulas do semestre e o número de aulas que o aluno compareceu, calcular o percentual de frequência e exibir se o aluno está apto (frequência ≥ 75%) ou reprovado por falta. */

import java.util.Scanner;

public class Frequencia {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int aulasTotal, aulasPres, frequencia;

        System.out.print ("Digite o número total de aulas do semestre: ");
        aulasTotal = scanner.nextInt();

        System.out.print ("Digite o número de aulas que o aluno compareceu: ");
        aulasPres = scanner.nextInt();
        
        frequencia = (aulasPres * 100) / aulasTotal;

        if (frequencia >= 75) {
            System.out.println ("Aluno apto. | Frequência: " + frequencia + "%");
        }
        else {
            System.out.println ("Aluno reprovado por falta. | Frequência: " + frequencia + "%");
        }
        
        scanner.close();
    }
}
