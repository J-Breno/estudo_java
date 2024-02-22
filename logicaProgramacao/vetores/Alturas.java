import java.util.Locale;
import java.util.Scanner;

public class Alturas {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		int qtdPessoas;
		double total = 0, count = 0;
		
		System.out.print("Quantas pessoas serao digitas? ");
		qtdPessoas = sc.nextInt();
		
		String[] nome = new String[qtdPessoas];
		int[] idade = new int[qtdPessoas];
		double[] altura = new double[qtdPessoas];
		
		
		
		for(int i = 0; i < qtdPessoas; i++) {

			System.out.printf("Dados da %da Pessoa: %n", (i+1));
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			total += altura[i];
		}	
		System.out.printf("Altura média: %.2f%n", (total / qtdPessoas));
		
		
		
		for(int i = 0; i < qtdPessoas; i++) {
		
			if(idade[i] < 16) {
				count++;
			}
		}
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", ((count / qtdPessoas ) * 100.0));
		
		for(int i = 0; i < qtdPessoas; i++) {
		
			if(idade[i] < 16) {
				System.out.printf("%s%n", nome[i]);
			}
		}
		
		sc.close();
	}	
}