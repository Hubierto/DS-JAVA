import java.util.Scanner;

public class Menu4 {

    public static void main(String[] args) {
                 
    Scanner sc = new Scanner(System.in);
        
    int num = 0;
    while (num != 5) {

    System.out.println("\nDigite um número: ");
    int primeiroNumero=sc.nextInt();    

    System.out.println("\nDigite outro número: ");
    int segundoNumero=sc.nextInt();

    System.out.println("\n1-Soma-");
    System.out.println("2-Subtração");
    System.out.println("3-Divisão-");
    System.out.println("4-Multiplição-");
    System.out.println("5-Sair-");
    System.out.println("Digite uma opção: ");
    num=sc.nextInt();

    switch (num) {
        case 1:
            System.out.print("Resultado: ");
            System.out.println(primeiroNumero + segundoNumero);
            break;
        case 2:
            System.out.print("Resultado: ");
            System.out.println(primeiroNumero - segundoNumero);
            break;
        case 3:
            System.out.print("Resultado: ");
            System.out.println(primeiroNumero / segundoNumero);
            break;
        case 4:
            System.out.print("Resultado: ");
            System.out.println(primeiroNumero * segundoNumero);
            break;
        default:
            System.out.println("Opção inválida");
            break;
            }
        }
        sc.close();
            
         
    }

    
}
