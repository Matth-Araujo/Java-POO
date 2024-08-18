import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Insira os dados do cliente:");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date dataNasc = sdf.parse(scan.next());

        Cliente cliente = new Cliente(nome, dataNasc, email);

        System.out.println("Insira os dados do pedido: ");
        System.out.print("Status: ");
        StatusPedido status = StatusPedido.valueOf(scan.next());

        Encomenda encomenda = new Encomenda(new Date(), status, cliente);

        System.out.print("Quantos itens para este pedido? ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Insira os dados do item #" + (i + 1));
            System.out.print("Nome do produto: ");
            scan.nextLine();
            String nomeProduto = scan.nextLine();
            System.out.print("Valor do produto: ");
            double valorProduto = scan.nextDouble();
            ;

            Produto produto = new Produto(nomeProduto, valorProduto);

            System.out.print("Quantidade: ");
            int quantidade = scan.nextInt();

            ItensPedido itensPedido = new ItensPedido(quantidade, valorProduto, produto);

            encomenda.addItem(itensPedido);
        }
        System.out.println();
        System.out.println("RESUMO DO PEDIDO:");
        System.out.println(encomenda);

        scan.close();

    }
}