package es.maralboran.generador_claves;

import org.junit.Test;

public class GeneradorClavesTest
{
	@Test
	public void testDeCubrimiento()
	{
		GeneradorClaves generadorClaves = new GeneradorClaves();
		
		generadorClaves.lanzarProceso("5", "4", "3");
	}
}
