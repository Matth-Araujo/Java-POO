import Entities.Produto;
import Entities.ProdutoImportado;
import Entities.ProdutoUsado;

import java.awt.color.ProfileDataException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Produto> lista = new ArrayList();
        System.out.print("Insira o numero de produtos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Produto #" + (i + 1));
            System.out.print("Comum, usado, importado (c/u/i)? ");
            char tipo = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            if (tipo == 'c') {
                lista.add(new Produto(nome, preco));
            } else if (tipo == 'u') {
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                lista.add(new ProdutoUsado(nome, preco, date));
            } else if (tipo == 'i') {
                System.out.print("Taxa de importação: ");
                double taxa = sc.nextDouble();
                lista.add(new ProdutoImportado(nome, preco, taxa));
            }

        }
        System.out.println();
        System.out.println("Etiquetas de preço: ");
        for (Produto produto : lista) {
            System.out.println(produto.EtiquetaPreco());
        }

    }
}