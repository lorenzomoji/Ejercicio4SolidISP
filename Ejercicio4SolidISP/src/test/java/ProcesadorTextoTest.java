
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.ejercicio4solidisp.Idioma;
import org.lasencinas.ejercicio4solidisp.ProcesadorSimple;
import org.lasencinas.ejercicio4solidisp.ProcesadorTexto;


public class ProcesadorTextoTest {
    
        @Test
	public void test_simple() {
		
		ProcesadorSimple procesador = new ProcesadorSimple();
		
		procesador.nueva("No");
		procesador.nueva("himporta");
		procesador.nueva("la");
		procesador.nueva("hortografia");
		
		assertEquals("No himporta la hortografia", procesador.texto());
	}
	
	@Test
	public void test_con_idioma() {
		
		ProcesadorTexto procesador = new ProcesadorTexto();
		
		procesador.nueva("Tengo");
		procesador.nueva("hambre");
		
		assertEquals("Tengo hambre", procesador.texto());
		
		assertTrue(procesador.correcto(Idioma.ES));
	}
}
