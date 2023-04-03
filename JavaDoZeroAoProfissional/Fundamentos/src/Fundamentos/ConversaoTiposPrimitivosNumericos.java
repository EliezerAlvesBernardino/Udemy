package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        double a = 1; //implícita
        System.out.println(a);

        float b = (float) 1.121212121219098; // explícita (CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // explícita (Cast)
        System.out.println(d);

        double e = 1.99999999;
        int f = (int) e; // explicita (CAST)
        System.out.println(f);
    }
}
