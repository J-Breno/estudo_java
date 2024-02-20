import java.util.Scanner;
import java.util.Locale;

public class Lanchonete {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codProduto;
        int qtdComprada;
        double preco;
        double precoTotal;

        System.out.print("Codigo do produto comprado: ");
        codProduto = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        qtdComprada = sc.nextInt();

        if(codProduto == 1) {
            preco = 5.00;
            precoTotal = preco * qtdComprada;
        }  else if(codProduto == 2) {
            preco = 3.50;
            precoTotal = preco * qtdComprada;
        } else if(codProduto == 3) {
            preco = 4.80;
            precoTotal = preco * qtdComprada;
        }  else if(codProduto == 4) {
            preco = 8.90;
            precoTotal = preco * qtdComprada;
        } else {
            preco = 7.32;
            precoTotal = preco * qtdComprada;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n",  precoTotal);

        sc.close();
    }
}