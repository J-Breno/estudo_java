import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 5 - Troco Verificado");

        double precoProduto,valorProduto, recebido, troco;
        int qtdComprada;
        System.out.print("Preço unitário do produto: ");
        precoProduto = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qtdComprada = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        recebido = sc.nextDouble();

        valorProduto = precoProduto * qtdComprada;
        if(valorProduto < recebido) {
            troco = recebido - valorProduto;
            System.out.println("TROCO = " + troco);
        } else {
            troco = valorProduto - recebido;
            System.out.println("DINHEIRO INSUFICIENTE. Faltam " +
                    troco +" Reais");
        }



    }
}
