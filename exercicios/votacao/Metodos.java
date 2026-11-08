import java.util.Scanner;
import java.util.Random;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Metodos{
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    File arquivo = new File("Votação2021.txt");
    //Scanner ler = new Scanner(arquivo);

    Votacao[] votacao = new Votacao[200];

    int k = 0;

    public void carregarSecaoECandidato(){

        for (int i = 0; i < votacao.length; i++){
            votacao[i] = new Votacao();
        }

        for (int j = 0; j < votacao.length; j++){
            //System.out.println("Qual é a seção?");
            votacao[j].numeroSecao = rand.nextInt(11);

            //System.out.println("Digite o número do seu candidato:");
            votacao[j].numeroCandidato = rand.nextInt(301);
        }

        System.out.println("Eleitor " + (k + 1) + "° registrado com sucesso!");
    }

    //#1
    public void cadastrarRegistros(){
        while (this.k < 200){
            carregarSecaoECandidato();
            k++;
        }
    }

    //#2
    public void ordenarSecao(){
        int temp = 0;

        for (int m = 0; m < 199; m++){
            for (int n = (m + 1); n < votacao.length; n++){
                if (votacao[m].numeroSecao > votacao[n].numeroSecao){

                    temp = votacao[m].numeroSecao;
                    votacao[m].numeroSecao = votacao[n].numeroSecao;
                    votacao[n].numeroSecao = temp;
                }
            }
        }

        for (int y = 0; y < votacao.length; y++){
            System.out.println(votacao[y].numeroSecao);
        }

        System.out.println("\nDados classificados!\n");
    }

    //#3
    public void gravarRegistros(){
        try{
            PrintWriter  gravar = new PrintWriter(new FileWriter("Votação2021.txt"));

            for (Votacao linha : votacao){
                gravar.println(linha.numeroSecao + ";" + linha.numeroCandidato);
            }

            gravar.close();

        } catch (IOException e){

            System.out.println("\n--->ERRO<---\n");
        }

        System.out.println("\nArquivo Gerado!\n");
    }

    //#4
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
                    //eleitoresSecao();
                    break;

                case 2:
                    //secaoMaiorMenor();
                    break;

                case 3:
                    //votosCandidato();
                    break;

                case 4:
                    //topDez();
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


    // public Votacao[] lerArquivo(){
    //     String[] dados = new String[2];

    //     try{
    //         while (ler.hasNextLine()){
    //             String linha = ler.nextLine();
    //             dados[] = linha.split(";");
    //         }

    //         ler.close();    
    //         return dados;                
    //     }

    //     catch (IOException e){
    //         System.out.println("\n--->ERRO<---\n");
    //         return null;
    //     }
    // }
}