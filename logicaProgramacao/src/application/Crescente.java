import java.util.Scanner;
import java.util.Locale;

public class Crescente {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x > y) {
			System.out.println("Decrescente!");
		} else {
			System.out.println("Crescente!");
		}
		
		while(x != y) {
			System.out.println("Digite dois numeros: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if(x > y) {
				System.out.println("Decrescente!");
			} else {
				System.out.println("Crescente!");
			}
		}
	}
}
