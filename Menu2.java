import java.util.Scanner;

public class Menu2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int num=0;
        while (num != 4) {

            System.out.println("===MENU===");
            System.out.println("1-Caneta Esferográfica: Econômica e de longa duração");
            System.out.println("2-Caneta Gel: Tinta mais pigmentada e escrita suave");
            System.out.println("3-Caneta Tinteiro: Clássica e elegante, usada para caligrafia");
            System.out.println("4-Sair");
            System.out.println("Escolha uma opção: ");
            num=teclado.nextInt(); 
            
            switch (num) {
                case 1:
                    System.out.println("\nOpção escolhida: Caneta Esferográfica\n");
                    break;
            
                case 2:
                    System.out.println("\nOpção escolhida: Caneta Gel\n");
                    break;

                case 3:
                    System.out.println("\nOpção escolhida: Caneta Tinteiro\n");
                    break;

                case 4:
                    System.out.println("\nObrigado!!\n");
                    break;
            
                default:
                    System.out.println("\nTente noovamente com uma opção válida!\n");
                    break;
            }
        }
    
        teclado.close();
    }
    
}
