import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdVetor, count = 0;
		double soma = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		qtdVetor = sc.nextInt();
		
		int[] vetor = new int[qtdVetor];
		
		for( int i = 0; i < qtdVetor; i++ ) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		for( int i = 0; i < qtdVetor; i++ ) {
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];
				count++;
			}
		}
		
		if(soma == 0) {
			System.out.println("Nenhum valor par!");
		} else {
			System.out.println("Media dos pares = " + (soma /  count));
		}
		
		
	}
}