import java.util.Scanner;

public class If {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("-Para sabermos se você é de maior-");
        System.out.println("\nDigite sua idade: ");
        int idade=sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é de maior!");
        } else {
            System.out.println("Você não é de maior!");
        }

        sc.close();
     }
    
}
