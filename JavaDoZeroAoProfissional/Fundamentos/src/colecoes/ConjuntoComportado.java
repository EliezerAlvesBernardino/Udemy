package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

      //  Set<String> listaAprovados = new HashSet<String>();
        SortedSet<String> listaAprovados = new TreeSet<String>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String cadidato : listaAprovados){
            System.out.println(cadidato);
        }

        Set<Integer> nums = new HashSet<Integer>();
        nums.add(10);
        nums.add(2);
        nums.add(22);
        nums.add(15);
    }
}
