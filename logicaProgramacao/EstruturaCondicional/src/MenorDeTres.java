import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y, z, menor;
        System.out.print("Primeiro valor: ");
        x = sc.nextInt();
        System.out.print("Segundo valor: ");
        y = sc.nextInt();
        System.out.print("Terceiro valor: ");
        z = sc.nextInt();

        menor = 999;

        if(x < menor) {
            menor = x;
        }

        if(y < menor) {
            menor = y;
        }
        if(z < menor) {
            menor = z;
        }

        System.out.println("Menor = " + menor);
    }
}
