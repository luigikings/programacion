package Objetos2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestContador {

	@Test
	public void TestIncrementar() {
		Contador contini = new Contador(2);
		Contador esperado = new Contador(2);
		int resultado = contini.incrementar();
		assertEquals(esperado, resultado);		

	}
	
}
