import java.util.Locale;
import java.util.Scanner;

public class MediaIdade {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double total = 0;
		int idade;
		double media;
		int count = 1;
		
		System.out.println("Digite as idades: ");
		idade = sc.nextInt();
		
		if(idade < 0) {
			System.out.println("Impossivel calcular");
		}
		total += idade;
		while( idade >= 0) {
			idade = sc.nextInt();
			if(idade >= 0) {
				total += idade;
				count++;
			}
		}
	
		media = total / count;
		if(total > 0) {
				
			System.out.printf("Media = %.2f%n", media);
			
		}
	}
}