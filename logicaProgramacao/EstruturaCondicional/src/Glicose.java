import java.util.Locale;
import java.util.Scanner;

public class Glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double glicose;
        String resultado;

        System.out.print("Digite a medida da glicose: ");
        glicose = sc.nextDouble();

        if(glicose <= 100) {
            resultado = "normal";
        } else if(glicose <= 140) {
            resultado = "elevado";
        } else {
            resultado = "diabetes";
        }

        System.out.println("Classificação: " + resultado);
    }
}
