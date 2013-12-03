

import static org.junit.Assert.*;

import org.junit.Test;

public class LogicaTEST {

	Logica verificador = new Logica();
	
	@Test
	public void pruebadecondicion1deaniobisiestoquesupera1() {
		assertEquals(true, verificador.verificacionBisiesto(1992));
	}

}
