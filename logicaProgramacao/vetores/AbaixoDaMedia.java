import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdElemento;
		double total = 0, media;
		
		System.out.print("Quantos elementos vai ter no vetor? ");
		qtdElemento = sc.nextInt();
		
		double[] vetor = new double[qtdElemento];
		
		for( int i = 0; i < qtdElemento; i++ ) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			total += vetor[i];
		}
		media = total / qtdElemento;
		System.out.printf("Media do vetor = %.3f%n", media);
		System.out.println("Elementos abaixo da media: ");
		
		for( int i = 0; i< qtdElemento; i++ ) {
			if(vetor[i] < media) {
				System.out.printf("%.1f%n", vetor[i]);
				
			}
		}
	}
}