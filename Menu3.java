import java.util.Scanner;

public class Menu3 {

    public static void main(String[] args) {
                 
    Scanner sc = new Scanner(System.in);
        
    int num = 0;
    while (num != 4) {

    System.out.println("\n-MENU-\n");
    System.out.println("1-Mochila escolar: compacta e ideal para estudantes-");
    System.out.println("2-Mochila de viagem: Espacosa, ideal para longas viagens-");
    System.out.println("3-Mochila esportiva: Leve,resistente e ergonômica-");
    System.out.println("4-Sair-");
    System.out.println("Digite uma opção: ");
        num=sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Mochila escolar: compacta e ideal para estudantes");
                break;
            case 2:
                System.out.println("Mochila de viagem: Espacosa, ideal para longas viagens");
                break;
            case 3:
                System.out.println("Mochila esportiva: Leve,resistente e ergonômica");
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
            }
        }
        sc.close();
            
         
    }

    
}
