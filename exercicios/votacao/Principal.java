import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Votacao[] votacao = new Votacao[2];
        Metodos metodos = new Metodos();

        int entrada = 0;

        while (entrada != 9){
            System.out.println("\n\n------------------------------------------------");
            System.out.println("\t\tSISTEMA DE VOTAÇÃO\n1-) Carregar Seção/Número Eleitor\n2-) Classificar por Seção");
            System.out.println("3-) Gravar Registros\n4-) Mostrar Indicadores\n9-) Finalizar");
            System.out.println("------------------------------------------------");

            System.out.println("\n\nDigite o número que deseja:");
            entrada = scan.nextInt();

            switch (entrada){
            case 1:
                metodos.cadastrarRegistros();
                break;

            case 2:
                metodos.ordenarSecao();
                break;

            case 3:
                metodos.gravarRegistros();
                break;

            case 4:
                metodos.mostrarIndicadores();
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