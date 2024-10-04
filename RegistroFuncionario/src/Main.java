import Entities.Funcionario;
import Entities.TercerizarFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();


        System.out.print("Insira o número de funcionarios: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario #"+ (i+1));
            System.out.print("Tercerizado (y/n)? ");
            char s = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            double horas = sc.nextDouble();
            System.out.print("Valor por horas trabalhadas: ");
            double valorHoras = sc.nextDouble();
            if (s == 'y') {
                System.out.print("Custo adicional: ");
                double custo = sc.nextDouble();
                //Funcionario funcionario = new TercerizarFuncionario(nome,horas,valorHoras,custo);
                lista.add(new TercerizarFuncionario(nome,horas,valorHoras,custo));
            }else {
                lista.add(new Funcionario(nome, horas, valorHoras));
            }
        }
        System.out.println();
        System.out.println("Pagamentos: ");
        for (Funcionario funcionario : lista) {
            System.out.println(funcionario.getNome()+ " - $"+String.format("%.2f", funcionario.pagamento()));
        }



        sc.close();
    }
}