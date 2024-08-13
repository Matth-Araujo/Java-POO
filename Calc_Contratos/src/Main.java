import entities.ContratoHora;
import entities.Departamento;
import entities.NivelTrabalhador;
import entities.Trabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do Departamento: ");
        String nomeDepartamento = scan.nextLine();
        System.out.println("\nEntre com  os dados do Trabalhador: ");
        System.out.print("Nome: ");
        String nomeTrab = scan.nextLine();
        System.out.print("Nivel: ");
        String levelTrab = scan.nextLine();
        System.out.print("Salario base: ");
        Double salarioTrab = scan.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrab, NivelTrabalhador.valueOf(levelTrab),salarioTrab, new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos para este trabalhador: ");
        int n = scan.nextInt();

        for (int i = 0 ; i < n ; i++){
            System.out.println("Insira os dados do contrato #"+ (i+1) + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(scan.next());
            System.out.print("Valor por hora: ");
            double valorHora = scan.nextDouble();
            System.out.print("Duração (horas): ");
            int hora = scan.nextInt();
            ContratoHora contrato = new ContratoHora(valorHora,hora,dataContrato);
            trabalhador.addContrato(contrato);
        }
        System.out.println();
        System.out.print("Insira o mês e o ano para calcular a renda (MM/YYYY): ");
        String mes_ano = scan.next();
        int mes = Integer.parseInt(mes_ano.substring(0,2));
        int ano = Integer.parseInt(mes_ano.substring(3));
        System.out.println("Nome: "+ trabalhador.getNome());
        System.out.println("Departamento: "+ trabalhador.getDepartamento().getNome());
        System.out.println("Renda para "+ mes_ano + ": "+String.format("%.2f",trabalhador.renda(ano,mes)));



        scan.close();
        }
    }
