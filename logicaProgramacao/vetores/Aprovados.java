import java.util.Scanner;
import java.util.Locale;


public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdAlunos; 
		
		System.out.print("Quantos alunos serao digitados? ");
		qtdAlunos = sc.nextInt();
		double media;
		String[] nome = new String[qtdAlunos];
		double[] nota1 = new double[qtdAlunos];
		double[] nota2 = new double[qtdAlunos];
		
		for( int i = 0; i < qtdAlunos; i++ ) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", (i+1));
			nome[i] = sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		System.out.println("Alunos aprovados: ");
		
		for( int i = 0; i < qtdAlunos; i++ ) {
			media = (nota1[i] + nota2[i]) / 2;
			if(media >= 6) {
				System.out.println(nome[i]);
			}
		}
	}
}