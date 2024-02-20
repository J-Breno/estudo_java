import java.util.Locale;
import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 4 - Operadora");

        int minutos, resto;
        double preco = 0;

        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();

        if(minutos > 100) {
            resto = minutos - 100;
            preco = (resto * 2) + 50;
        }

        System.out.println("Valor a pagar: R$ " + preco);

    }
}
