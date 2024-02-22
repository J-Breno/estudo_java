import java.util.Locale;
import java.util.Scanner;

public class CadaLinha {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdMatriz;
		System.out.print("Qual a ordem da matriz? ");
		qtdMatriz = sc.nextInt();
		
		int[][] matriz = new int[qtdMatriz][qtdMatriz];
		int[] vetor = new int[qtdMatriz];
		
		for( int i = 0; i < qtdMatriz; i++ ) {
			for(int j = 0; j <qtdMatriz; j++ ) {
				System.out.printf("Elemento[%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
				if(matriz[i][j] > vetor[i] ) {
					vetor[i] = matriz[i][j];
				}
			}
		}
		System.out.println("Maior elemento de cada linha: ");
		for(int i = 0; i < qtdMatriz; i++ ){ 
			System.out.println(vetor[i]);
		}
		
	}
}