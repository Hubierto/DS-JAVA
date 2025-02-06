import java.util.Scanner;

public class Imc{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Para o calculo do seu imc");

        System.out.println("Digite quanto você pesa: ");
        double peso=sc.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura=sc.nextDouble();

        double imc=peso/altura;

        System.out.println("Seu Imc: "+imc);

        sc.close();
    }
}