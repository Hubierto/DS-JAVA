import java.util.ArrayList;

public class ArrayListSimples {

    public static void main(String[] args) {
        //Criando um arraylist de inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        //Adicionando elementos ao arraylist
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        //Exibindo os elementos do ArrayList
        System.out.println("Elementos do ArrayList de inteiros: ");
        for (Integer numero : numeros) {
            System.out.println(numero);
            
        /*  Exibindo os elementos do arraylist
        System.out.println("Exibindo os elementos do ArrayList de inteiros: "+numeros); */

        }

        //Verificando o tamanho do arraylist
        int tamanho = numeros.size();
        System.out.println("Tamanho do arraylist: "+tamanho);
        
        //Verificando a existência de um elemento
        boolean existeElemento30 = numeros.contains(30);
        System.out.println("Existe o elemento 30? "+ existeElemento30);

        //Removendo o elemento
        numeros.remove(Integer.valueOf(30));//removendo o valor 30
        System.out.println("Após a remoção do elemento 30: ");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}