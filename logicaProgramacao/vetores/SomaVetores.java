import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdVetor;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		qtdVetor = sc.nextInt();
		
		int[] vetorA = new int[qtdVetor];
		int[] vetorB = new int[qtdVetor];
		int[] somaVetor = new int[qtdVetor];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for( int i = 0; i < qtdVetor; i++ ) {
			
			vetorA[i] = sc.nextInt();
			
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		for( int i = 0; i < qtdVetor; i++ ) {
			
			vetorB[i] = sc.nextInt();
			
		}
		
		System.out.println("Vetore resultante: ");
		for( int i = 0; i < qtdVetor; i++ ) {
			
			somaVetor[i] = vetorA[i] + vetorB[i];
			System.out.println(somaVetor[i]);
		}
		

	}
}