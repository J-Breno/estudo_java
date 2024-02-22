import java.util.Scanner;
import java.util.Locale;

public class DivFatorial {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double total = 1, fatorial = 1;
		
		System.out.print("Informe um numero: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) { // i de 1 até n

		   fatorial = 1;
		// produtorio(fatorial)
	        for(int j = 1; j <= i; j++) { // j de 1 até i
			
			fatorial *= j;

		    }
		
		    total += 1 / fatorial;

	    }
		
		System.out.print("O resultado é: " + total);
	}
}