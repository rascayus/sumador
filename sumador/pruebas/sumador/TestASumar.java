package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
	public void testUnaCifra() {
        ASumar sumi = new ASumar("7");
        String resultado = sumi.mostrar();
        assertEquals("7 = 7",resultado );
    }	@Test
	public void testNegativo() {
        ASumar sumi = new ASumar("-18785");
        String resultado = sumi.mostrar();
        assertEquals("",resultado );
    }	@Test
	public void testMayorNueve() {
        ASumar sumi = new ASumar("17785");
        String resultado = sumi.mostrar();
        assertEquals("1+7+7+8+5 = 28",resultado );
    }

}
