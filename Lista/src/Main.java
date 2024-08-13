import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marcos");
        System.out.println("Tamanho da lista: " + list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------");
        // list.remove("Bob"); // ou list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M'); // remove toda string começada com M

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------");
        System.out.println("Indice do Bob: " + list.indexOf("Bob"));
        System.out.println("Indice do Marcos: " + list.indexOf("Marcos")); // quando nao acha retorna -1

        System.out.println("-----------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-----------------------");
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);

        scan.close();
    }
}