import java.util.Scanner;
import java.util.Locale;

public class Primo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int primo = 0, naoPrimo = 0, x;
		
		System.out.print("Digite um numero: ");
		x = sc.nextInt();
		
		for(int i = 1; i <= x; i++ ) {
		
			if(x % i == 0) {
				primo++;
				
			} else {
				naoPrimo++;
				
			}
			
		}
		
		if(primo > 2 || x == 1) {
			System.out.println("Não e primo");
		} else {
			System.out.println("E primo!");	
		}
	}
}