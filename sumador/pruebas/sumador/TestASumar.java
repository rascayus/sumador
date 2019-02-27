package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
	public void testUnaCifra() {
        ASumar sumi = new ASumar("7");
        String resultado = sumi.mostrar();
        assertEquals("7 = 7",resultado );
    }

}
