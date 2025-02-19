public class Diversao {

    public static void main(String[] args) {
    

        int numeros[] ={1,2,3,4,5};

        System.out.println("Números do Array");
        int media =0;
        int soma = 0;
        for (int i : numeros) {
            System.out.println(i);
            soma +=i;
            media = soma/5;
        }
        System.out.println("A média desses números é de: "+ media);
    }
    
}
