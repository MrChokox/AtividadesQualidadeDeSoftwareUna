import java.util.Scanner;

public class Exercicio0103 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		String resp, entrada;

		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Digite a primeira nota: ");
			nota1 = input.nextDouble();

			System.out.println("Digite a segunda nota: ");
			nota2 = input.nextDouble();

			System.out.println("Digite a terceira nota: ");
			nota3 = input.nextDouble();

			media = (nota1 + nota2 + nota3) / 3;
			System.out.printf("A média é: %.2f", media);

			System.out.println("\nDeseja continuar? Se sim digite \"sim\". ");
			resp = input.next();

		} while (resp.equalsIgnoreCase("sim"));

	}
}
