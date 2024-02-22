import java.util.Locale;
import java.util.Scanner;

public class SomaLinhas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdLinhas, qtdColunas;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		qtdLinhas = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		qtdColunas = sc.nextInt();
		
		double[][] matriz = new double[qtdLinhas][qtdColunas];
		double[] vetor = new double[qtdLinhas];
		
		for(int i = 0; i < qtdLinhas; i++ ) {
			System.out.printf("Digite os elementos da %da. linha: ", (i+1));
			for(int j = 0; j < qtdColunas; j++) {
				matriz[i][j] = sc.nextDouble();
				vetor[i] += matriz[i][j];
			}
		}
		System.out.println("Vetor gerado: ");
		for(int i = 0; i < qtdLinhas; i++) {
			System.out.println(vetor[i]);
			
		}
	}
}