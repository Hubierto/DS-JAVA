import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha=sc.next();

        if(senha.equals("Alfa")){
            System.out.println("Porta aberta!");
        } else{
            System.out.println("porta fechada");
        }
        sc.close();
    }
    
}
