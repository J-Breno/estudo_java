import java.util.Locale;
import java.util.Scanner;

public class ParesConsecutivos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, total, count;
		count = 0;
		total = 0;
		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();
		
		while(count <5 && x != 0) {
		
			if(x % 2 == 0) {
				total += x;
				x += 2;		
			} else {
				x += 1;
				total += x;
				x += 2;
			}
				
			count++;
		}
		
		System.out.printf("SOMA = %d%n", total);
	
	}
}