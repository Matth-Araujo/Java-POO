import enti.Conta;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Conta conta;

        System.out.print("Entre com o número da conta: ");
        int num = scan.nextInt();
        System.out.print("Entre com o Titular da conta: ");
        scan.nextLine();
        String titular = scan.nextLine();
        System.out.print("Deseja fazer um deposito inicial [s/n]? ");
        char op = scan.next().charAt(0);

        if (op == 'y'){
            System.out.print("Entre com o valor do deposito: ");
            float depositoinicial = scan.nextFloat();
            conta = new Conta(num,titular,depositoinicial);
        } else {
            conta = new Conta(num,titular);
        }
        System.out.println("Dados da Conta: ");
        System.out.println(conta);

        System.out.print("Entre com o valor do deposito: ");
        float deposito = scan.nextFloat();
        conta.Deposito(deposito);
        System.out.println("Dados da Conta atualizados: ");
        System.out.println(conta);

        System.out.print("Entre com o valor que deseja sacar:");
        float saque = scan.nextFloat();
        conta.Sacar(saque);
        System.out.println("Dados da Conta atualizados: ");
        System.out.println(conta);


        scan.close();
    }
}