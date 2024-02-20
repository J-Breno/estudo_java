import java.util.Scanner;
import java.util.Locale;

public class TempoDeJogo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.print("Hora inicial = ");
        horaInicial = sc.nextInt();
        System.out.print("Hora final = ");
        horaFinal = sc.nextInt();

        if(horaInicial > horaFinal) {
            duracao = 24 - horaInicial + horaFinal;
        } else if(horaInicial == horaFinal) {
            duracao = 24;
        } else {
            duracao = horaFinal - horaInicial;
        }
        System.out.printf("O jogo durou %d hora(s)%n", duracao);
    }
}
