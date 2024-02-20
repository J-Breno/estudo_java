import java.util.Scanner;
import java.util.Locale;
public class Multiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x, y, a;
        System.out.println("Digite dois numeros inteiros: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if(y > x) {
            a = y;
            y = x;
            x = a;
        }



        if(x % y == 0 ){
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos!");
        }
    }
}
