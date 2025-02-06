import java.util.Scanner;

public class WhilePositivo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int i=1;

        while (i > 0) {
            System.out.println("digite um número: ");
            i=sc.nextInt();

        }
        sc.close();
    }
}