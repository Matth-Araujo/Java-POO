import entities.Comentario;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Faça boa viagem ");
        Comentario c2 = new Comentario("Uau, isso é incrível!");
        Post p1 = new Post(sdf.parse("21/06/2024 13:05:44"),"Viajando para a nova Zelândia", "Vou visitar esse país maravilhoso!",12);
        p1.addComentarios(c1);
        p1.addComentarios(c2);

        System.out.println(p1);


        Comentario c3 = new Comentario("Boa noite");
        Comentario c4 = new Comentario("Graça e paz sejam convosco");

        Post p2 =  new Post(sdf.parse("15/08/2024 20:45:34"),"Boa noite pessoal","Vejo você amanhã",5);
        p2.addComentarios(c3);
        p2.addComentarios(c4);

        System.out.println(p2);


    }
}