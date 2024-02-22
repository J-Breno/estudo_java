import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdMatriz, soma = 0;
		
		System.out.print("Qual a ordem da matriz? ");
		qtdMatriz = sc.nextInt();
		
		int[][] matriz = new int[qtdMatriz][qtdMatriz];
		
		for(int i = 0; i < qtdMatriz; i++) {
			for(int j = 0; j < qtdMatriz; j++ ) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < qtdMatriz; i++) {
			
			for(int j = i; j < qtdMatriz; j++) {
				if((j+1) < 4) {
					soma += matriz[i][j+1];
				}
			}	
			
		}
		System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
	}
}