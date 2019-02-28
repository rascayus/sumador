package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
	public void testUnaCifra() {
        ASumar sumi = new ASumar("-17785");
        String resultado = sumi.mostrar();
        assertEquals("",resultado );
    }

}
