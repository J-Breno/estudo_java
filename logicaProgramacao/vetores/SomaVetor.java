import java.util.Scanner;
import java.util.Locale;

public class SomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma = 0, media;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			
		}
			System.out.print("Valores = ");
		for(int i = 0; i < n; i++) {

			System.out.printf("%.1f ", vetor[i]);
			soma += vetor[i];
		}
		
		media = soma / n;
		System.out.printf("%nSoma = %.2f%n", soma);
		System.out.printf("Media = %.2f%n", media);
		
	}
}