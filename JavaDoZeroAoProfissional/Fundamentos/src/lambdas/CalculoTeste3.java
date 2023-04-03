package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

        //NÃO: int -> Double
        // double -> Double
        BinaryOperator<Double> calculo = (x, y) -> { return x + y; };
        System.out.println(calculo.apply(2.0,3.0));

        calculo = (x, y) -> x * y;
        System.out.println(calculo.apply(2.0,3.0));

        BinaryOperator<Integer> calc2 = (x, y) -> {return x + y ; };
        System.out.println(calc2.apply(2, 5));

        calculo = (x, y) -> x * y;
        System.out.println(calc2.apply(2, 3));


    }

}
