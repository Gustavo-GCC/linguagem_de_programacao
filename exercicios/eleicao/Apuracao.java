public class Apuracao
{
    int secao;
    int codigoCandidato;
    int numeroEleitor;

    Apuracao()
    {
        this(0, 0, 0);
    }

    Apuracao(int secao, int codigoCandidato, int numeroEleitor)
    {
        this.secao = secao;
        this.codigoCandidato = codigoCandidato;
        this.numeroEleitor = numeroEleitor;
    }
}