import java.util.Locale;
import java.util.Scanner;
public class Dardo {
    public static void main(String[]  args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 6 - Dardo");

        double x, y, z, maior;

        System.out.println("Digite as três distancias: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();

        maior = 0;
        if(x > maior) {
            maior = x;
        }

        if(y > maior) {
            maior = y;
        }

        if(z > maior) {
            maior = z;
        }

        System.out.println("Maior distancia = " + maior);
    }
}
