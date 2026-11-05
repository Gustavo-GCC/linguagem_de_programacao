public class Eleitor
{
    int numeroEleitor;
    String nomeEleitor;
    int secao;

    Eleitor()
    {
        this(0, "", 0);
    }

    Eleitor(int eleitorNumero, String eleitorNome, int secaoo)
    {
        numeroEleitor = eleitorNumero;
        nomeEleitor = eleitorNome;
        secao = secaoo;
    }
}