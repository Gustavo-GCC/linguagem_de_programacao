public class Transmissao
{
    String nomeAluno;
    String sobrenomeAluno;
    int notaAluno;

    Transmissao()
    {
        this("", "", 0);
    }

    Transmissao(String nomeAluno, String sobrenomeAluno, int notaAluno)
    {
        this.nomeAluno = nomeAluno;
        this.sobrenomeAluno = sobrenomeAluno;
        this.notaAluno = notaAluno;
    }
}