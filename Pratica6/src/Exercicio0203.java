import java.util.Scanner;

public class Exercicio0203 {

	public static void main(String[] args) {
		int anoNascimento, anoAtual, idade, idadeEspecifica;
		String resp;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Digite o seu ano de Nascimento: ");
			anoNascimento = input.nextInt();

			System.out.println("Digite o ano atual: ");
			anoAtual = input.nextInt();

			idade = anoAtual - anoNascimento;
			System.out.println("A sua idade é: " + idade);

			idadeEspecifica = 2050 - anoNascimento;
			System.out.println("A sua idade em 2050 é: " + idadeEspecifica);
			System.out.println("\nDeseja continuar? Se sim digite \"sim\". ");
			resp = input.next();

		} while (resp.equalsIgnoreCase("sim"));

	}

}
