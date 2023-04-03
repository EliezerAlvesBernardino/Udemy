package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> obter o próximo elemento da fila (sem remover)

        // Diferença é o comportamento quando a fila está vazia!

        System.out.println(fila.peek()); // Retorna Null
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        // fila.size()
        // fila.clear()
        // fila.isEmpty()

        // Poll e Remove -> obtem o próximo da fila e remove!

        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.poll()); // Lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}
