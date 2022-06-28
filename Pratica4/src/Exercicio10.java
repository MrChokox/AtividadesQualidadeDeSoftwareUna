import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double valor1 = 0, valor2 = 0, resultado = 0;

		System.out.print("Digite um número: ");
		valor1 = ler.nextDouble();
		System.out.print("Digite outro número: ");
		valor2 = ler.nextDouble();

		System.out.println("\nPARA OS NUMEROS INFORMADOS, VOCÊ DESEJA? ");

		System.out.println("\n[1]Somar? ");
		System.out.println("[2]Subtrair? ");
		System.out.println("[3]Multiplicar? ");
		System.out.println("[4]Dividir?");
		System.out.println("[5]Sair.");

		System.out.print("\nInforme a Opção desejada. \n");
		int opcao = ler.nextInt();

		switch (opcao) {
		case 1:
			resultado = (valor1 + valor2);
			System.out.println("\nO resultado da operação é: " + resultado);
			break;
		case 2:
			resultado = (valor1 - valor2);
			if (valor2 > valor1) {
				resultado = (valor2 - valor1);
			}
			System.out.println("\nO resultado da operação é: " + resultado);
			break;
		case 3:
			resultado = (valor1 * valor2);
			System.out.println("\nO resultado da operação é: " + resultado);
			break;
		case 4:
			if (valor2 == 0) {
				System.out.println("Impossivel dividir por 0.");
			} else {

				resultado = (valor1 / valor2);
				System.out.println("\nO resultado da operação é: " + resultado);
				break;
			}
		case 5:
			if (opcao == 5) {
				System.out.println("PROGRAMA FINALIZADO.");
				System.exit(0);
			}

		default:
			System.out.println("\nOpção inválida.");
		}

		ler.close();
	}

}
