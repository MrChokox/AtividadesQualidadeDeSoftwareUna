package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import numero.Numero;

public class NumeroTeste {
	Numero numero;
	@Before
	public void setUp() throws Exception {
		numero = new Numero();
	}

	@Test
	public void testRaizCubica() {
		assertEquals("CASO 1:", 3, numero.raizCubica(27), 0);
		assertEquals("CASO 2:", 2.71, numero.raizCubica(20), 0.01);
	}

	@Test
	public void testFatorial() {
		assertEquals("CASO 3:", 120, numero.fatorial(5), 0);
		assertEquals("CASO 4:", 1, numero.fatorial(0), 0);
	}

	@Test
	public void testSomaIntervalo() {
		assertEquals("CASO 5:", 15, numero.somaIntervalo(5), 0);
		assertEquals("CASO 6:", 0, numero.somaIntervalo(0), 0);
	}

}
