public class MenuPrincipal
{
    public static void main(String[] args)
    {
        Metodos metodos = new Metodos();
        int entrada = 0;

        while (entrada != 0)
        {
            System.out.println("\n------------------------------------------------");
            System.out.println("\t\tMENU PRINCIPAL\n1-) Cadastra Eleitor\n2-) Cadastra Votação 1 e 2");
            System.out.println("3-) Agrupa Apuração\n4-) Menu Estatística\n9-) FIM");
            System.out.println("------------------------------------------------");

            metodos.leitura(entrada);

            switch (entrada) {
                case 1:
                    
                    break;
                
                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
                
                case 4:
                    menuEstatistica();
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