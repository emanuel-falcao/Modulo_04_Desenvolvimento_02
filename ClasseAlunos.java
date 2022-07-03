import java.util.Scanner;

public class ClasseAlunos extends Alunos {
    public static void main(String[] args) {
        String nome;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Nome do Aluno 1");
        nome = ler.next();
        Alunos al_1 = new Alunos();

        al_1.set(nome);
        al_1.registraAluno();

        Alunos al_2 = new Alunos();
        System.out.println("Digite o Nome do Aluno 2");
        nome = ler.next();
        al_2.set(nome);
        al_2.registraAluno();

        Alunos al_3 = new Alunos();
        System.out.println("Digite o Nome do Aluno 3");
        nome = ler.next();
        al_3.set(nome);
        al_3.registraAluno();

        System.out.println("Os Nomes dos Alunos : \n" + al_1.nome + "\n" + al_2.nome + "\n" + al_3.nome);
        System.out.println("O numero de Alunos é: ");

        System.out.println(Alunos.contagem);

    }
}