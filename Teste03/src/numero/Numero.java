package numero;

public class Numero {
	
	public double raizCubica(double numero) {
		return Math.cbrt(numero);
	}

	public int fatorial(int numero) {
		int retorno=1;
		for (int i = 0; i < numero; i++) {
			retorno = retorno * (numero - i);
		}
		return retorno;
	}
	
	public int somaIntervalo(int numero) {
		int retorno=0;
		for (int i = 0; i < numero; i++) {
			retorno = retorno + (numero - i);
		}
		return retorno;
		
	}

}
