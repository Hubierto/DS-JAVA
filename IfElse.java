import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero=sc.nextInt();

        if (numero > 0) {

            System.out.println("Número positivo!");
        } else{
            
            if(numero < 0) {
                System.out.println("Número negativo!");
            } 
            else{
                System.out.println("Valor nulo!");
            }
            
        }
        sc.close();
    }
    
}
