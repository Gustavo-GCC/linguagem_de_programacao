public class Transmissao
{
    String nomeAluno;
    String sobrenomeAluno;
    int notaAluno;

    Transmissao()
    {
        this("", "", 0);
    }

    Transmissao(String nome, String sobrenome, int nota)
    {
        nomeAluno = nome;
        sobrenomeAluno = sobrenome;
        notaAluno = nota;
    }
}