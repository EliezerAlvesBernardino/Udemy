package Controle;

public class For2 {
    public static void main(String[] args) {

        int contador = 0;

        //Crescente
        for (contador = 0; contador <= 10; contador++){
            System.out.println(contador);
        }

        //Decrescente
        for (contador = 10; contador >= 0; contador -= 2){
            System.out.printf("\nContador = %d",contador);
        }
    }
}
