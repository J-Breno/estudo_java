import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
	
	public static void main(String[] args) {	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdNum, pos = 0;
		double maiorValor = 0;
		
		System.out.print("Quanto numeros voce vai digitar? ");
		qtdNum = sc.nextInt();
		
		double[] vetor = new double[qtdNum];
		
		for(int i = 0; i < qtdNum; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			
			if(vetor[i] > maiorValor) {
				
				maiorValor = vetor[i];
				pos = i;
			}
		}
		
		System.out.printf("Maior valor = %.1f%n", maiorValor);
		System.out.println("Posicao do maior valor: " + pos);
		
		sc.close();
	}		
}

