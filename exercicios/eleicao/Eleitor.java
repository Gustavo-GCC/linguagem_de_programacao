public class Eleitor
{
    int numeroEleitor;
    String nomeEleitor;
    int secao;

    Eleitor()
    {
        this(0, "", 0);
    }

    Eleitor(int numeroEleitor, String nomeEleitor, int secao)
    {
        this.numeroEleitor = numeroEleitor;
        this.nomeEleitor = nomeEleitor;
        this.secao = secao;
    }
}