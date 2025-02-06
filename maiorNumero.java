import java.util.Scanner;

public class maiorNumero {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int primeiroNumero=sc.nextInt();

        System.out.println("Digite outro número: ");
        int segundoNumero=sc.nextInt();

        if (primeiroNumero > segundoNumero) {

            System.out.println(primeiroNumero+" é maior que "+segundoNumero);
            
        } else {

            if(primeiroNumero < segundoNumero){
                System.out.println(segundoNumero+" é maior que "+primeiroNumero);
            }

            else  {
                System.out.println("Ambos possuem o mesmo valor!");
            }
        }
        sc.close();

    }
    
}
