import java.util.Scanner;
import java.util.Locale;

public class SomaMatrizes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdLinhas, qtdColunas;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		qtdLinhas = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		qtdColunas = sc.nextInt();
		
		int[][] matrizA = new int[qtdLinhas][qtdColunas];
		int[][] matrizB = new int[qtdLinhas][qtdColunas];
		int[][] matrizC = new int[qtdLinhas][qtdColunas];
		
		System.out.println("Digite os valores da matriz A: ");
		for(int i = 0; i < qtdLinhas; i++ ){

			for( int j = 0; j < qtdColunas; j++) {
				System.out.printf("Elemento[%d][%d]: ", i, j);
				matrizA[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Digite os valores da matriz B: ");
		for(int i = 0; i < qtdLinhas; i++ ){

			for( int j = 0; j < qtdColunas; j++) {
				System.out.printf("Elemento[%d][%d]: ", i, j);
				matrizB[i][j] = sc.nextInt();
				
			}
		}
		
		for(int i = 0; i < qtdLinhas; i++ ){

			for( int j = 0; j < qtdColunas; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
				
			}
		}
		System.out.println("Matriz soma: ");
		for(int i = 0; i < qtdLinhas; i++) {
			
			for(int j = 0; j < qtdColunas; j++ ) {
				System.out.printf("%d ", matrizC[i][j]);
			}
			System.out.println();
		}
	}
}