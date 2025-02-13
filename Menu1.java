import java.util.Scanner;

public class Menu1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num = 0;
        while (num != 4) {
            System.out.println("===MENU===");
            System.out.println("1-Caixa de papelão - Ideal para transporte e armazenamento");
            System.out.println("2-Sacola plástica - Leve e prática, mas pouco sustentável");
            System.out.println("3-Embalagem de vidro - Resistente e reutilizável");
            System.out.println("4-Sair");
            System.out.println("Escolha uma opção: ");
            num=teclado.nextInt(); 
            
            switch (num) {
                case 1:
                    System.out.println("\nOpção escolhida: Caixa de papelão\n");
                    break;
            
                case 2:
                    System.out.println("\nOpção escolhida: Sacola plástica\n");
                    break;

                case 3:
                    System.out.println("\nOpção escolhida: Embalagem de vidro\n");
                    break;

                case 4:
                    System.out.println("Obrigado!!");
                    break;
            
                default:
                    System.out.println("Tente noovamente com uma opção válida!");
                    break;
            }
        }
        teclado.close();

    }
}