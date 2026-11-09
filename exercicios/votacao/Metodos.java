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

    Votacao[] votacao = new Votacao[200];
    Votacao[] dados = new Votacao[200];

    int k = 0;
    int[] contadorSecao = new int[11];
    int[] contadorCandidato = new int[301];


    public void carregarSecaoECandidato(){

        for (int i = 0; i < votacao.length; i++){
            votacao[i] = new Votacao();
        }

        for (int j = 0; j < votacao.length; j++){
            //System.out.println("Qual é a seção?");
            votacao[j].numeroSecao = rand.nextInt(11);

            //System.out.println("Digite o número do seu candidato:");
            votacao[j].numeroCandidato = rand.nextInt(301);
            
            System.out.println("Seção: " + votacao[j].numeroSecao + "\tCandidato: " + votacao[j].numeroCandidato);
        }

        //System.out.println("Eleitor " + (k + 1) + "° registrado com sucesso!");
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
        Votacao temp = new Votacao();

        for (int m = 0; m < 199; m++){
            for (int n = (m + 1); n < votacao.length; n++){
                if (votacao[m].numeroSecao > votacao[n].numeroSecao){

                    temp = votacao[m];
                    votacao[m] = votacao[n];
                    votacao[n] = temp;
                }
            }
        }

        // for (int y = 0; y < votacao.length; y++){
        //     System.out.println(votacao[y].numeroSecao);
        // }

        System.out.println("\nDados classificados!\n");
    }


    //#3
    public void gravarRegistros(){
        try{
            PrintWriter  gravar = new PrintWriter(new FileWriter("Votação2021.txt"));

            for (Votacao linha : votacao){
                gravar.print(linha.numeroSecao + ";" + linha.numeroCandidato);

                if (linha != votacao[votacao.length - 1]){
                    gravar.println();
                }
            }

            gravar.close();

        } catch (IOException e){

            System.out.println("\n--->ERRO<---\n");
        }

        System.out.println("\nArquivo Gerado!\n");
    }


    public void apagarArquivo(){
        if (arquivo.exists()){
            arquivo.delete();
            System.out.println("\nAntigo arquivo deletado para que não haja problemas nesta execução");
        }
    }


    //#4
    public void lerArquivo(){
        int z = 0;

        try{
            Scanner ler = new Scanner(arquivo);

            while (ler.hasNextLine()){
                String linha = ler.nextLine();
                String[] numerosLinha = linha.split(";");

                int secao = Integer.parseInt(numerosLinha[0]);
                int candidato = Integer.parseInt(numerosLinha[1]);

                dados[z] = new Votacao(secao, candidato);
                z++;
            }

            ler.close();
        }

        catch (IOException e){
            System.out.println("\n--->ERRO<---\n");
        }
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
                    eleitoresSecao();
                    break;

                case 2:
                    secaoMaiorMenor();
                    break;

                case 3:
                    votosCandidato();
                    break;

                case 4:
                    topDezCandidatos();
                    break;

                case 9:
                    System.out.println("\nRetornando ao SISTEMA DE VOTAÇÃO");
                    break;

                default:
                    System.out.println("\nNÚMERO INVÁLIDO\nTENTE NOVAMENTE");
                    break;
            }
        }
    }


    //#4.1
    public void eleitoresSecao(){

        for (int f = 0; f < dados.length; f++){
            contadorSecao[dados[f].numeroSecao]++;
        }
        
        System.out.println("");

        for (int g = 0; g < contadorSecao.length; g++){
            System.out.println("Quantidade de Eleitores na seção " + g + ":\t" + contadorSecao[g]);
        }
    }


    //#4.2
    public void secaoMaiorMenor(){
        int maior = 0, menor = 0;
        
        for (int h : contadorSecao){

            if (h == 0){
                maior = contadorSecao[h];
                menor = contadorSecao[h];
            }

            if (contadorSecao[h] > maior){
                maior = contadorSecao[h];
            } else if (contadorSecao[h] < menor){
                menor = contadorSecao[h];
            }
            // } else if (contadorSecao[h] == maior){

            // } else if (contadorSecao[h] == menor){

            // }
        }
        
        System.out.println("\nMENOR: " + menor + "\nMAIOR: " + maior);
    }


    //#4.3
    public void votosCandidato(){
        
        for (int a = 0; a < dados.length; a++){
            contadorCandidato[dados[a].numeroCandidato]++;
        }

        System.out.println("");

        for (int b = 0; b < contadorCandidato.length; b++){
            System.out.println("O candidato cujo número é " + b + " recebeu " + contadorCandidato[b] + " votos");
        }
    }


    //#4.4
    public void topDezCandidatos(){
        Votacao aux = new Votacao();
        int prov = 0;
        Votacao[] vetorAuxiliar = new Votacao[dados.length];

        for (int p = 0; p < dados.length; p++){
            vetorAuxiliar[p] = dados[p];
        }        

        for (int c = 0; c < (contadorCandidato.length - 1); c++) {
            for (int d = (c + 1); d < contadorCandidato.length; d++) {
                
                if (contadorCandidato[c] < contadorCandidato[d]){
                    prov = contadorCandidato[c];
                    contadorCandidato[c] = contadorCandidato[d];
                    contadorCandidato[d] = prov;
                }
            }
        }

        for (int q = 0; q < (vetorAuxiliar.length - 1); q++){
            for (int r = (q + 1); r < vetorAuxiliar.length; r++){

                if (vetorAuxiliar[q].numeroCandidato < vetorAuxiliar[r].numeroCandidato){
                    aux = vetorAuxiliar[q];
                    vetorAuxiliar[q] = vetorAuxiliar[r];
                    vetorAuxiliar[r] = aux;
                }
            }
        }

        System.out.println("\nOs top 10 candidados mais votados são estes:");

        for (int e = 0; e < 10; e++){
            System.out.println("\tCandidato " + vetorAuxiliar[e].numeroCandidato + " -- " + contadorCandidato[e] + " votos");
        }
    }
}