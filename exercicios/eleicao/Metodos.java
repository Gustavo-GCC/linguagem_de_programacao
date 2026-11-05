import java.util.Scanner;

public class Metodos
{
    public int leitura(int x)
    {
        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();

        return x;
    }

    public void menuEstatistica()
    {
        int input = 0;

        while (input != 0)
        {
            System.out.println("\n------------------------------------------------");
            System.out.println("\t\tMENU ESTATÍSTICA\n1-) Vencedor\n2-) Segundo Colocado");
            System.out.println("3-) Votos em Branco\n4-) Votos Nulos");
            System.out.println("5-) Mostrar Eleitores\n6-) Mostrar Apuração\n9-) FIM");
            System.out.println("------------------------------------------------");

            leitura(input);

            switch (input) {
                case 1:
                    
                    break;
                
                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
                
                case 4:
                    
                    break;
                
                case 9:
                    System.out.println("\nFIM DO PROGRAMA");
                    break;
                    
                default:
                    System.out.println("\nNÚMERO INVÁLIDO - TENTE NOVAMENTE!");
                    break;
            }
        }
    }
}