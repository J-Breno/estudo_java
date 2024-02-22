import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int qtdPessoa, maisVelha = 0;
		String p = "";
		System.out.print("Quantas pessoas voce vai digitar? ");
		qtdPessoa = sc.nextInt();
		
		String[] nome = new String[qtdPessoa];
		int[] idade = new int[qtdPessoa];
		
		for( int i = 0; i < qtdPessoa; i++ ) {
			System.out.printf("Dados da %da pessoa: %n", (i+1));
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			if(idade[i] > maisVelha) {
				maisVelha = idade[i];
				p = nome[i];
			}

		}
		System.out.println("Pessoa mais velha: " + p);
	}
}