import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdPessoas;
		double menorAltura, maiorAltura, mediaAltura, somaF = 0, countF = 0, countM = 0;
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		qtdPessoas = sc.nextInt();
		
		double[] altura = new double[qtdPessoas];
		char[] genero = new char[qtdPessoas];
		menorAltura = 999;
		maiorAltura = 0;
		
		for( int i = 0; i < qtdPessoas; i++ ) {
			
			System.out.printf("Altura da %da pessoa: ", (i+1));
			altura[i] = sc.nextDouble();
			
			System.out.printf("Genero da %da pessoa: ", (i+1));
			genero[i] = sc.next().charAt(0);
			
			if(altura[i] < menorAltura) {
			
				menorAltura = altura[i];
				
			} 
			
			if(altura[i] > maiorAltura) {
				
				maiorAltura = altura[i];
				
			}
			
			if(genero[i] == 'F' || genero[i] == 'f') {
				somaF += altura[i];
				countF++;
				
			}
			
			if(genero[i] == 'M' || genero[i] == 'f') {
				countM++;
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		mediaAltura = somaF / countF;
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAltura);
		System.out.println("Numero de homens = " + countM);
	}
}