import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        System.out.println("Hello, World!");
        System.out.println("Olá mundo");

        SaidaDeDados.impressao();
    }
}
