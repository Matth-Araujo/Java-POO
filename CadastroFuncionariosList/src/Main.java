import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos funcionarios vao ser registrados: ");
        int n = scan.nextInt();


        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < n ; i++){
            System.out.println();
            System.out.printf("Funcionario #%d \n", i+1);

            System.out.print("Id: ");
            Integer id = scan.nextInt();
            while(verificadorId(list,id)){
                System.out.println("Id ja existente! tente de novo:");
                id = scan.nextInt();
            }

            scan.nextLine();

            System.out.print("Nome: ");
            String nome = scan.nextLine();

            System.out.print("Salario: ");
            Double salario = scan.nextDouble();

            Funcionario funcio =  new Funcionario(nome,salario,id);

            list.add(funcio);
        }

        System.out.println();
        System.out.print("Entre com id do funcionario que tera o salario aumentado: ");
        int idsal = scan.nextInt();
        //Funcionario funci = list.stream().filter(x-> x.getId() == idsal).findFirst().orElse(null);
        Integer pos = posicao(list,idsal);

        if (pos ==  null){
            System.out.println("Este id nao existe! ");

        } else {
            System.out.print("Entre com a porcentagem: ");
            double taxa = scan.nextDouble();
            list.get(pos).Incrementosalario(taxa);
        }

        System.out.println();
        System.out.println("Lista de Funcionarios");
        for (Funcionario func : list){
            System.out.println(func);
        }

        scan.close();
    }


    public static Integer posicao(List<Funcionario> list, int id){
        for (int i = 0 ; i<list.size() ; i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean verificadorId(List<Funcionario> list,int id){
        Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return fun != null;
    }

}