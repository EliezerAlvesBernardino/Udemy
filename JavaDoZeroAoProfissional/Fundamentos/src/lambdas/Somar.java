package lambdas;

public class Somar implements ICalculo {

    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
