/* Ler o valor da compra e o valor pago em dinheiro. Se o valor pago for menor que o da compra, exibir mensagem de "pagamento insuficiente"; caso contrário, calcular e exibir o troco. */

import java.util.Scanner;

public class TrocoCompra {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        double vCompra, vPago, troco;

        System.out.print ("Digite o valor da compra: ");
        vCompra = scanner.nextDouble();

        System.out.print ("Digite o valor pago: ");
        vPago = scanner.nextDouble();

        if (vPago < vCompra) {
            System.out.println ("Pagamento insuficiente.");
        }
        else {
            troco = vPago - vCompra;

            System.out.printf ("Troco: R$ %.2f", troco);
        }

        scanner.close();
    }
}