import java.util.Scanner;


public class Metodos
{
    Transmissao[] aluno = new Transmissao[3];


    public void carregarAlunos()
    {
        Scanner scan = new Scanner(System.in);


        for (int k = 0; k < 3; k++)
        {
            aluno[k] = new Transmissao();
        }


        for (int i = 0; i < 3; i++)
        {
            System.out.println("\n\n->Digite o nome do " + (i + 1) + "° aluno");
            aluno[i].nomeAluno = scan.nextLine();

            System.out.println("->Digite o sobrenome do " + (i + 1) + "° aluno");
            aluno[i].sobrenomeAluno = scan.nextLine();

            System.out.println("->Digite a nota do " + (i + 1) + "° aluno");
            aluno[i].notaAluno = scan.nextInt();

            scan.nextLine();
        }
    }


    public void mostrarAlunos()
    {
        for (int j = 0; j < 3; j++)
        {
            System.out.println("\n\nNOME: " + aluno[j].nomeAluno + "\nSOBRENOME: " + aluno[j].sobrenomeAluno + "\nNOTA: " + aluno[j].notaAluno + "\n");
        }
    }
}



