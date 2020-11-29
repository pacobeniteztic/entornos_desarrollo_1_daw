package es.maralboran.encuentra_los_errores;

import org.junit.Test;

/**
 * El nombre de vuestra clase debe ser: EncuentraLosErrores<InicialesNombreYApellidos>Test
 * Por ejemplo: Francisco Manuel Benítez Chico sería: FMBC. Por ello, el nombre de la clase es EncuentraLosErroresFMBCTest
 */
public class EncuentraLosErroresFMBCTest
{
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Cubrimiento
	 * Descripción: Se pretende pasar por el mayor número de líneas posibles de código.
	 * 				Se utilizarán datos que hace que se ejecute correctamente.
	 */
	@Test
	public void testDeCubrimiento()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores("12", "1", "true", "2");
	}
}
