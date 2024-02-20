import java.util.Scanner;
import java.util.Locale;

public class Aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioAtual, novoSalario, aumentoSalarial;

        System.out.print("Digite o salario da pessoa: ");
        salarioAtual = sc.nextDouble();

        if(salarioAtual <= 1000) {
            aumentoSalarial =  0.2 * salarioAtual ;
            novoSalario = aumentoSalarial + salarioAtual;
            System.out.printf("Novo salário = R$ %.2f%n", novoSalario);
            System.out.printf("Aumento = R$ %.2f%n", aumentoSalarial);
            System.out.println("Porcentagem = 20 %");
        } else if(salarioAtual < 3000) {
            aumentoSalarial = 0.15 * salarioAtual;
            novoSalario = aumentoSalarial + salarioAtual;
            System.out.printf("Novo salário = R$ %.2f%n", novoSalario);
            System.out.printf("Aumento = R$ %.2f%n", aumentoSalarial);
            System.out.println("Porcentagem = 15 %");
        } else if(salarioAtual < 8001) {
            aumentoSalarial = 0.1 * salarioAtual;
            novoSalario = aumentoSalarial + salarioAtual;
            System.out.printf("Novo salário = R$ %.2f%n", novoSalario);
            System.out.printf("Aumento = R$ %.2f%n", aumentoSalarial);
            System.out.println("Porcentagem = 10 %");
        } else {
            aumentoSalarial = 0.05 * salarioAtual;
            novoSalario = aumentoSalarial + salarioAtual;
            System.out.printf("Novo salário = R$ %.2f%n", novoSalario);
            System.out.printf("Aumento = R$ %.2f%n", aumentoSalarial);
            System.out.println("Porcentagem = 5 %");
        }
    }
}
