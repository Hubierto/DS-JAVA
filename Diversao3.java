
import java.util.Scanner;

public class Diversao3 {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int numeros[] = new int[10];
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            
            for(int i = 0; i < 10; i++){
                
                System.out.println("Digite um numero: ");
                numeros[i]=sc.nextInt();

                if (numeros[i] > maior) {
                    maior = numeros[i];
            }
                if(numeros[i] < menor){
                    menor = numeros[i];
            } 
        }
            System.out.println("\nnúmeros\n");
            for (int i=0; i < numeros.length; i++) {
                
                System.out.println(numeros[i]);
                
                
            }
            System.out.println("O maior número é: "+maior );
            System.out.println("O menor número é: "+menor );
        }

    }
    
}
