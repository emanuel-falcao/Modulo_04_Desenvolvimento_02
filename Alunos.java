/******************************************************************************

 Crie uma classe de sua preferência com, no mínimo, uma variável, um método e
 um incremento. Depois, desenvolva três ou mais objetos para testar o código.

 *******************************************************************************/

public class Alunos {
    public String nome;
    public static int contagem = 0;

    public void set(String nome){
        this.nome = nome;
    }

    public void registraAluno(){
        contagem = contagem + 1;
    }
}
