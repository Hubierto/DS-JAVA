import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Criando arraylist
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> telefones = new ArrayList<>();

        int num = 0;
        String nome;
        String telefone;

        while(num != 4){
        System.out.println("\n1-Cadastrar");
        System.out.println("2-Listar");
        System.out.println("3-Excluir");
        System.out.println("4-Sair");
        System.out.println("Digite uma opção: "+"\n");
        num=sc.nextInt();
        sc.nextLine(); // Limpar o buffer de entrada após o nextInt()


        switch(num){
            case 1:
            for(int i=0; i <= 2; i++){
                System.out.println("Digite seu nome: ");
                nome=sc.nextLine();
                nomes.add(nome); //Adiciona o nome a lista
        
                System.out.println("Digite seu  telefone: ");
                telefone=sc.nextLine();
                telefones.add(telefone); //Adiciona o telefone a lista
            }
                break;
            case 2:
                for (int i =0; i<nomes.size(); i++) {
                        System.out.println("\nNome: "+nomes.get(i));
                        System.out.println("Telefone: "+telefones.get(i));
                    }
                break;
                
            case 3:
                System.out.println("Digite o nome que você de seja excluir: "+"\n");
                nome=sc.nextLine(); 

                int index = nomes.indexOf(nome);// Encontrar o índice do nome na lista

                if(index != -1){ // Se o nome for encontrado
                    nomes.remove(index);  // Remove o nome
                    telefones.remove(index); // Remove o telefone correspondente
                    System.out.println("Cadastro excluído");
                } else{
                    System.out.println("Não encontrado");
                }
                break;
            
            case 4:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }    
        }  
        for(int i=0;i<=2;i++){
        //System.out.println("Nome: "+nomes.get(i));
        //System.out.println("Telefone: "+telefones.get(i));
    }
    sc.close();
    }
    }
    

