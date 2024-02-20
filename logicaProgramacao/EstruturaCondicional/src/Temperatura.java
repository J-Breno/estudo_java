import java.util.Scanner;
import java.util.Locale;

public class Temperatura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        char temperatura;
        double valorTemperatura, valorTemperaturaConvertido;

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        temperatura = sc.next().charAt(0);

        if(temperatura == 'C' || temperatura == 'c') {

            System.out.print("Digite a temperatura em Celsius: ");
            valorTemperatura = sc.nextDouble();
            valorTemperaturaConvertido = (valorTemperatura * 9/5) + 32;
            System.out.println("Temperatura equivalente em Fahrenheit: " + valorTemperaturaConvertido);

        } else {

            System.out.print("Digite a temperatura em Fahrenheit: ");
            valorTemperatura = sc.nextDouble();
            valorTemperaturaConvertido = (valorTemperatura - 32) * 5/9;
            System.out.println("Temperatura equivalente em Celsius: " + valorTemperaturaConvertido);

        }

        sc.close();
    }
}