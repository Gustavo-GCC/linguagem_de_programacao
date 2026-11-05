public class Apuracao
{
    int secao;
    int codigoCandidato;
    int numeroEleitor;

    Apuracao()
    {
        this(0, 0, 0);
    }

    Apuracao(int secaoo, int candidatoCodigo, int eleitorNumero)
    {
        secao = secaoo;
        codigoCandidato = candidatoCodigo;
        numeroEleitor = eleitorNumero;
    }
}