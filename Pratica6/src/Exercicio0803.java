import java.util.Scanner;

public class Exercicio0803 {

	public static void main(String[] args) {
		double peso, pesoEngordar, pesoEmagrecer;
		String resp;
		do {
			Scanner input = new Scanner(System.in);

			System.out.println("Digite o peso: ");
			peso = input.nextDouble();

			pesoEngordar = peso * 1.15;
			pesoEmagrecer = peso * 0.80;

			System.out.println("Se a pessoa engordar 15% seu peso será: " + pesoEngordar);
			System.out.println("Se a pessoa emagrecer 20% seu peso será: " + pesoEmagrecer);
			System.out.println("\nDeseja continuar? Se sim digite \"sim\". ");
			resp = input.next();

		} while (resp.equalsIgnoreCase("sim"));

	}
}
