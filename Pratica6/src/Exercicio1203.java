import java.util.Scanner;

public class Exercicio1203 {

	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		String resp;
		do {
			Scanner input = new Scanner(System.in);

			System.out.println("Digite o coeficiente a: ");
			a = input.nextDouble();
			System.out.println("Digite o coeficiente b: ");
			b = input.nextDouble();
			System.out.println("Digite o coeficiente c: ");
			c = input.nextDouble();

			delta = Math.pow(b, 2) - 4 * a * c;

			x1 = (-b + delta) / 2 * a;
			x2 = (-b - delta) / 2 * a;

			System.out.println("delta = " + delta);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			System.out.println("\nDeseja continuar? Se sim digite \"sim\". ");
			resp = input.next();

		} while (resp.equalsIgnoreCase("sim"));
	}
}
