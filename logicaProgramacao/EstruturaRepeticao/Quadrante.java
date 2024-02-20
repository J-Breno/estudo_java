import java.util.Locale;
import java.util.Scanner;

public class Quadrante {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite os valores coordenadas X e Y: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			
			if( x > 0 && y > 0 ) {
				System.out.println("Quadrante Q1");
			} else if(x < 0 && y > 0) {
				System.out.println("Quadrante Q2");
			} else if(x < 0 && y < 0) {
				System.out.println("Quadrante Q3");
			} else {
				System.out.println("Quadrante Q4");
			}
			System.out.println("Digite os valores coordenadas X e Y: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			
		}
	}
}