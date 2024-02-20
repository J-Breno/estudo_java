import java.util.Scanner;
import java.util.Locale;

public class Notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double soma;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        soma = nota1 + nota2;
        System.out.println("Nota Final = " + soma);

        if(soma >= 60) {

            System.out.println("Aprovado!");

        } else {
            System.out.println("Reprovado!");
        }

    }
}
