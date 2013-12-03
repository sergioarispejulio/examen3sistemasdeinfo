

import static org.junit.Assert.*;

import org.junit.Test;

public class LogicaTEST {

	Logica verificador = new Logica();
	
	@Test
	public void pruebadecondicion1deaniobisiestoquesupera1() {
		assertEquals(true, verificador.verificacionBisiesto(1992));
	}
	
	@Test
	public void pruebadecondicion1deaniobisiestoquesupera2() {
		assertEquals(true, verificador.verificacionBisiesto(40));
	}
	
	@Test
	public void pruebadecondicion1deaniobisiestoquenosupera1() {
		assertEquals(false, verificador.verificacionBisiesto(1994));
	}
	
	@Test
	public void pruebadecondicion1deaniobisiestoquenosupera2() {
		assertEquals(false, verificador.verificacionBisiesto(100));
	}
	
	

}
