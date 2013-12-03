

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
	public void pruebadecondicion1deaniobisiestoquesupera3() {
		assertEquals(true, verificador.verificacionBisiesto(400));
	}
	
	@Test
	public void pruebadecondicion1deaniobisiestoquesupera4() {
		assertEquals(true, verificador.verificacionBisiesto(1600));
	}
	
	@Test
	public void pruebadecondicion1deaniobisiestoquesupera5() {
		assertEquals(true, verificador.verificacionBisiesto(1768));
	}
	
	@Test
	public void pruebadecondicion1deaniobisiestoquenosupera1() {
		assertEquals(false, verificador.verificacionBisiesto(1994));
	}
	
	@Test
	public void pruebadecondicion1deaniobisiestoquenosupera2() {
		assertEquals(false, verificador.verificacionBisiesto(100));
	}
	
	@Test
	public void pruebadecondicion1deaniobisiestoquenosupera3() {
		assertEquals(false, verificador.verificacionBisiesto(1400));
	}
	
	@Test
	public void pruebadecondicion1deaniobisiestoquenosupera4() {
		assertEquals(false, verificador.verificacionBisiesto(2013));
	}
	
	@Test
	public void pruebadecondicion1deaniobisiestoquenosupera5() {
		assertEquals(false, verificador.verificacionBisiesto(1767));
	}
	
	

}
