import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdMatriz, positivo = 0, colunaEscolhida, linhaEscolhida;
		
		System.out.print("Qual a ordem da matriz? ");
		qtdMatriz = sc.nextInt();
		
		double[][] matriz = new double[qtdMatriz][qtdMatriz];
		
		for(int i = 0; i < qtdMatriz; i++) {
			for( int j = 0; j< qtdMatriz; j++) {
				System.out.printf("Elemento [%d, %d]: ", i, j);
				matriz[i][j] = sc.nextDouble();
				
				if(matriz[i][j] > 0) {
					positivo += matriz[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Soma dos positivos: " + positivo);
		System.out.println();
		
		System.out.print("Escolha uma linha: ");
		linhaEscolhida = sc.nextInt();

		for(int i = 0; i < qtdMatriz; i++ ) {
			System.out.print(matriz[linhaEscolhida][i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.print("Escolha uma coluna: ");
		colunaEscolhida = sc.nextInt();
		System.out.print("Coluna Escolhida: ");
		for(int i = 0; i < qtdMatriz; i++ ) {
			System.out.print(matriz[i][colunaEscolhida] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.print("Diagonal principal: ");
		for(int i = 0; i< qtdMatriz; i++){
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		System.out.println();
		for(int i = 0; i < qtdMatriz; i++) {
			for( int j = 0; j< qtdMatriz; j++) {	
				if(matriz[i][j] < 0) {
					matriz[i][j] = matriz[i][j] * matriz[i][j];
				}
			}
		}
		System.out.println("Matriz alterada: ");
		for(int i = 0; i < qtdMatriz; i++) {
			for( int j = 0; j< qtdMatriz; j++) {	
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}