import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade=sc.nextInt();

        if (idade >= 60) {

            System.out.println("Você é idoso!");
            
        } else {

            if(idade >= 18){
                System.out.println("Você é adulto");
            } else {
                if(idade >= 13){
                    System.out.println("Você é adolesceste");
                } 
                else{
                    System.out.println("Você é criança");
                }
            }
        }
        sc.close();
    }
    
}
