import java.util.Scanner;


public class Metodos
{
    int x = 2; 
    Transmissao[] aluno = new Transmissao[this.x];


    public void carregarAlunos()
    {
        Scanner scan = new Scanner(System.in);


        for (int k = 0; k < this.x; k++)
        {
            aluno[k] = new Transmissao();
        }


        for (int i = 0; i < this.x; i++)
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
        for (int j = 0; j < this.x; j++)
        {
            System.out.println("\n\nNOME: " + aluno[j].nomeAluno + "\nSOBRENOME: " + aluno[j].sobrenomeAluno + "\nNOTA: " + aluno[j].notaAluno + "\n");
        }
    }
}



