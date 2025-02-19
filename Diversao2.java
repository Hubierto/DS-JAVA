public class Diversao2 {

    public static void main(String[] args) {
        
        int numeros[] = {1,2,9,4,5};
        int maior = numeros[0];

        for(int i=0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: "+ maior);
    }
    
}
