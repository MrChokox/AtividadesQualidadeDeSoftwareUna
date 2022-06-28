import java.util.Scanner;

public class Exercicio1103 {

	public static void main(String[] args) {
		double numero, resultado;
		String resp="" ;
		do {
			Scanner input = new Scanner(System.in);

			System.out.println("Digite o número desejado: ");
			numero = input.nextDouble();

			for (int i = 0; i < 11; i++) {
				resultado = numero * i;
				System.out.println(numero + " x " + i + "= " + resultado);
				System.out.println("\nDeseja continuar? Se sim digite \"sim\". ");
				resp = input.next();

			}
		} while (resp.equalsIgnoreCase("sim"));

	}
}
