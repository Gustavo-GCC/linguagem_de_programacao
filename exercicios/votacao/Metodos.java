import java.util.Scanner;
import java.util.Random;

public class Metodos{
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    public void carregarSecaoECandidato(){
        Votacao[] votacao = new Votacao[2];

        for (int i = 0; i < 2; i++){
            votacao[i] = new Votacao();
        }

        for (int j = 0; j < 2; j++){
            System.out.println("Qual é a seção?");
            votacao[j].numeroSecao = rand.nextInt(10);

            System.out.println("Digite o número do seu candidato:");
            votacao[j].numeroCandidato = rand.nextInt(300);
        }
    }

    public void cadastrarRegistros(){
        for (int k = 0; k < 200; k++){
            carregarSecaoECandidato();
        }
    }

    public void mostrarIndicadores(){
        int input = 0;

        while (input != 9){
            System.out.println("\n------------------------------------------------");
            System.out.println("\tESTATÍSTICAS DE VOTAÇÃO EM 2021\n1-) Quantidade de Eleitores por Seção\n2-) Seção com Maior e Menor número de Eleitores");
            System.out.println("3-) Quantidade de votos por candidato\n4-) 10 primeiros colocados(n° cand e qtd votos)\n9-) Finalizar consulta");
            System.out.println("------------------------------------------------");

            System.out.println("\n\nDigite sua opção:");
            input = scan.nextInt();

            switch (input){
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 9:
                    System.out.println("\nFim do Programa");
                    break;

                default:
                    System.out.println("\nNÚMERO INVÁLIDO\nTENTE NOVAMENTE");
                    break;
            }
        }
    }
}