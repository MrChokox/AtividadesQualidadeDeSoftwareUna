import java.util.Scanner;

public class Exercicio0303 {

	public static void main(String[] args) {
		double cotacao, valorEmDolar, valorEmReais;
		String resp;
		do {
			Scanner input = new Scanner(System.in);

			System.out.println("Digite a cotação do dólar em reais: ");
			cotacao = input.nextDouble();

			System.out.println("Digite quanto possui em dólar: ");
			valorEmDolar = input.nextDouble();

			valorEmReais = cotacao * valorEmDolar;
			System.out.println("A conversão para reais é igual a: " + valorEmReais);
			System.out.println("\nDeseja continuar? Se sim digite \"sim\". ");
			resp = input.next();

		} while (resp.equalsIgnoreCase("sim"));

	}
}
