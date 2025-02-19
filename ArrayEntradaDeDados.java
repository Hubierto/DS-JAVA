import java.util.Scanner;

public class ArrayEntradaDeDados {

    /*
     * Crie um programa em Java que solicite ao usuário
     * a quantidade de nomes que deseja inserir.
     * Em seguida, utilize um array de strings para armazenar esses nomes.
     * O programa deve permitir que o usuário digite os nomes um por um e,
     * ao final, exiba todos os nomes cadastrados, mostrando também a posição de cada um no array.
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Definindo o tamanho do Array
        System.out.println("Quantos números deseja inserir?");
        int tamanho = sc.nextInt();
        sc.nextLine();//Consumir a quebra de linha

        //Criando o array com o tamanho informado pelo usuário    
        String nomes[] = new String[tamanho];

        //Preenchendo o array com os nomes digitados
        for (int i=0 ; i< nomes.length;i++) {
            System.out.println("Digite um nome: "+(i+1)+":");
            nomes[i]=sc.nextLine();
        }  
        System.out.println("\nNomes digitados: ");
        for (int i=0 ; i< nomes.length;i++) {
            System.out.println("Nome na posição:  "+(i+1)+" : " +nomes[i]);
            
        }
        sc.close();
 
    

}
}