import java.util.Scanner;

public class ForçaSobreObjeto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("-Para o calculo do trabalho realizado sobre a força que atua sobre um objeto-");

        System.out.print("\nDigite a força(em Newton) aplicada ao objeto: ");
        double forca=sc.nextDouble();

        System.out.print("Digite a distancia(em metros) percorrida pelo objeto: ");
        double distancia=sc.nextDouble();

        double trabalho = forca*distancia;
        
        System.out.println("O trabalho(em joule) realizado é igual á: "+trabalho+" joules");

        sc.close();
    }
    
}
