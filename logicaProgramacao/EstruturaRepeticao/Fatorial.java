import java.util.Scanner;
import java.util.Locale;

public class Fatorial {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, total = 1;
		
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			total *= i;
		}
		
		System.out.printf("Fatorial de %d e = %d", n, total);
	}
}