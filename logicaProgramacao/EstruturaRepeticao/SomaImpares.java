import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int x, y,a, b, total;
		total = 0;
		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		

		
		if(y > x) {
			a = y;
			y = x;
			x = a;
		} 
		

		a = x;
		b = y;
		for(int i = b; i <= a; i++){
			
			if(i < x && i > y && (i % 2 == 1 || i % 2 == -1)) {
				total += i;
			} 
		}
		
		System.out.println("Soma dos impares = " + total);
	}
}