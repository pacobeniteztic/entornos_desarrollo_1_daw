package es.maralboran.calculadora_cientifica;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraSimpleTest
{		
	@Test
	public void sumaCorrecta()
	{	
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		Assert.assertEquals(calculadoraSimple.suma("1", "2"), 3);
	}
	
	@Test
	public void sumaIncorrecta()
	{	
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		Assert.assertNotEquals(calculadoraSimple.suma("5", "2"), 3);
	}
	
	@Test(expected = RuntimeException.class)
	public void sumaConParametroAinvalido()
	{	
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		Assert.assertEquals(calculadoraSimple.suma("a", "2"), 3);
	}
	
	@Test(expected = RuntimeException.class)
	public void sumaConParametroBinvalido()
	{	
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		Assert.assertEquals(calculadoraSimple.suma("2", "b"), 3);
	}
	
	@Test
	public void aMayorQueBCorrecto()
	{	
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		Assert.assertTrue(calculadoraSimple.aMayorQueB("3", "1"));
	}
	
	@Test
	public void aMayorQueBInCorrecto()
	{	
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		Assert.assertFalse(calculadoraSimple.aMayorQueB("1", "3"));
	}
}
