import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ordemMatriz, count = 0;
		
		System.out.print("Qual a ordem da matriz? ");
		ordemMatriz = sc.nextInt();
		
		int[][] elemento = new int[ordemMatriz][ordemMatriz];
		
		for( int i = 0; i < ordemMatriz; i++ ) {
			for( int j = 0; j < ordemMatriz; j++ ) {
				System.out.printf("Elemento [%d, %d]: ", i, j);
				elemento[i][j] = sc.nextInt();
			}
			
			
		}
		System.out.println("Diagonal principal: ");
		for(int i = 0; i < ordemMatriz; i++ ){ 
			System.out.print(elemento[i][i] + " ");
			
			for( int j = 0; j < ordemMatriz; j++ ) {
				if(elemento[i][j] < 0) {
					count++;		
				}
			
				
			}
		}
		System.out.printf("%nQuantidade negtivos: %d", count);
		
	}
	
}