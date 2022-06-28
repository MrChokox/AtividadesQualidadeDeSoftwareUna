import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double fx = 0;
		System.out.println("Digite um valor: ");
		fx = ler.nextDouble();

		if (fx < -2) {
			fx = 2 * fx + 2;
		} else if (-2 <= fx && fx < 3) {
			fx = 3;
		} else if (3 <= fx) {
			fx = -fx;
		}
		System.out.println("\nO valor da função após receber um valor é: " + fx);
		ler.close();
	}
}