import java.util.Scanner;

public class Exercicio0603 {

	public static void main(String[] args) {
		double temperaturaCelcius, temperaturaFahrenheit;
		String resp;
		do {
			Scanner input = new Scanner(System.in);

			System.out.println("Digite a temperatura em Celcius: ");
			temperaturaCelcius = input.nextDouble();

			temperaturaFahrenheit = (temperaturaCelcius * 1.8) + 32;
			System.out.println("A temperatura em fahrenheit é: " + temperaturaFahrenheit);
			System.out.println("\nDeseja continuar? Se sim digite \"sim\". ");
			resp = input.next();

		} while (resp.equalsIgnoreCase("sim"));

	}
}
