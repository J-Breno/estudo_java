import java.util.Scanner;
import java.util.Locale;

public class Negativos {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros você vai digitar? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < n ; i++ ) {
		
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < n ; i++ ) {
				
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
				
			}
			
		}
	}
}