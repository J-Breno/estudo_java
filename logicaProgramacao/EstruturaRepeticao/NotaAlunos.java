import java.util.Scanner;
import java.util.Locale;

public class NotaAlunos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numerosDeAlunos, nota, reprovado = 0, aprovado = 0;
		System.out.print("Quantos alunos você irá verificar? ");
		numerosDeAlunos = sc.nextInt();
		
		for(int i = 0; i < numerosDeAlunos; i++ ) {
		
			System.out.printf("informe a nota do %da aluno: ", (i+1));
			nota = sc.nextInt();
			
			if(nota < 6) {
				reprovado++;	
			} else {
				aprovado++;
			}
		}
		
		System.out.println("Alunos aprovados = " + aprovado);
		System.out.println("Alunos reprovados = " + reprovado);
		
	}
}