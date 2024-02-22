import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdNum, count = 0;
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		qtdNum = sc.nextInt();
		
		int[] vetor = new int[qtdNum];
		
		for(int i = 0; i < qtdNum; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			
			if(vetor[i] % 2 == 0) {
				count++;
			}
		}
		
		System.out.print("Numeros pares: ");
		for(int i = 0; i < qtdNum; i++) {
			
			if(vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
			}
		}
		
		System.out.printf("%n%nQuantidade de pares = %d", count);
		
		
		sc.close();
	}
}