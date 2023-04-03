package lambdas;

@FunctionalInterface
public interface ICalculo {

    double executar(double a, double b);

    default String legal(){
        return "legal";
    }

    static String muitoLegal(){
        return "muito legal";
    }
}
