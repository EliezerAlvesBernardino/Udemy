package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.toUpperCase();
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);
        String x = "Léo".toUpperCase();
        System.out.println(x);
        String y = "Bom dia X".replace("X", "Gui");
        System.out.println(y);
    }
}
