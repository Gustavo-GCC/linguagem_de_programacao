import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Metodos metodos = new Metodos();

        int decisao = 0;

        while (decisao != 9)
        {
            System.out.println("\n------------------------------------------------");
            System.out.println("\t\tBOLETIM DOS ALUNOS\n\n1-) Inserir Dados dos Alunos\n\n2-) Consultar Dados dos Alunos\n\n9-) Finalizar");
            System.out.println("------------------------------------------------");

            decisao = scan.nextInt();

            switch (decisao)
            {
                case 1:
                    metodos.carregarAlunos();
                    break;

                case 2:
                    metodos.mostrarAlunos();
                    break;

                case 9:
                    System.out.println("\nFim do programa");
                    break;

                default:
                    System.out.println("\nNÚMERO INVÁLIDO");
                    break;
            }
        }

    }
}