import java.util.Scanner;
import java.util.Locale;

public class Comerciante {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdProdutos, baixo = 0,entre = 0, alto = 0;
		double totalCompra = 0, totalVenda = 0, lucroTotal; 
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		qtdProdutos = sc.nextInt();
		
		String[] nome = new String[qtdProdutos];
		double[] compra = new double[qtdProdutos];
		double[] venda = new double[qtdProdutos];
		
		for(int i = 0; i < qtdProdutos; i++) {
			
			System.out.printf("Produto %d: %n", (i+1));
			System.out.print("Nome");
			nome[i] = sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.print("Preco de compra: ");
			compra[i] = sc.nextDouble();
			System.out.print("Preco da venda: ");
			venda[i] = sc.nextDouble();
			
			totalCompra += compra[i];
			totalVenda += venda[i];
		} 
		
		lucroTotal = totalVenda - totalCompra;		
		
		System.out.println();
		System.out.println("Relatorio: ");
		System.out.println("Valor total de compra: " + totalCompra);
		System.out.println("Valor total de venda? " + totalVenda);
		System.out.println("Lucro total: " + lucroTotal);
	}
	
}