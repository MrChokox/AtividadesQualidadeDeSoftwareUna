import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Leia 10 números reais a partir do teclado e os armazene em um vetor. O algoritmo deve
        //imprimir o vetor e as posições do vetor que armazenam números negativos.
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + i + "º numero:");
            int num = sc.nextInt();
            vetor[i] = num;            
        }  
        System.out.println("==================================");
        System.out.println("Vetor: " + Arrays.toString(vetor));
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < 0)
                System.out.println("Posição: " + i + " valor: " + vetor[i]);
        }
        System.out.println("==================================");
        sc.close();

	}

}
