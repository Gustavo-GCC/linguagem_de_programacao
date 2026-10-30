public class Votacao{
    int numeroSecao;
    int numeroCandidato;

    Votacao(){
        this(0, 0);
    }

    Votacao(int nSec, int nCan){
        numeroSecao = nSec;
        numeroCandidato = nCan;
    }
}