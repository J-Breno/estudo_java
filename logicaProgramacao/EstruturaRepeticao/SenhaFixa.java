import java.util.Scanner;
import java.util.Locale;

public class SenhaFixa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Digite a senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			
			System.out.print("Senha Inválida! Tente Novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
	}
}