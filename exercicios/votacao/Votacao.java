public class Votacao{
    int numeroSecao;
    int numeroCandidato;

    Votacao(){
        this(0, 0);
    }

    Votacao(int numeroSecao, int numeroCandidato){
        this.numeroSecao = numeroSecao;
        this.numeroCandidato = numeroCandidato;
    }
}