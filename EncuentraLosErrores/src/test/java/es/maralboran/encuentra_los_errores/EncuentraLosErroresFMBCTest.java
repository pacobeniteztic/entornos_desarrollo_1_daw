package es.maralboran.encuentra_los_errores;

import org.junit.Test;

public class EncuentraLosErroresFMBCTest
{
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Condicionales
	 * Descripción: nos encontramos un NullPointerException en el parametro 'a' cuando su valor es null
	 * 				Dicha excepcion se produce en la linea 11
	 */
	@Test
	public void nullPointerEnParametroA()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores(null, null, null, null);
	}
	
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Condicionales
	 * Descripción: nos encontramos un NullPointerException en el parametro 'b' cuando su valor es null
	 * 				Dicha excepcion se produce en la linea 16
	 */
	@Test
	public void nullPointerEnParametroB()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores("", null, "true", "2");
	}
	
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Cubrimiento
	 * Descripción: nos encontramos un NullPointerException en el parametro 'd' cuando su valor es null
	 * 				Antes debe acceder dentro del bloque de codigo de la condicion de la linea 21
	 * 				Dicha excepcion se produce en la linea 24
	 */
	@Test
	public void nullPointerEnParametroD()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores("", "", "", null);
	}
	
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Bucle y Clase de Equivalencia de Datos
	 * Descripción: nos encontramos un NumberFormatException en el parametro 'a' cuando su valor no es numerico
	 * 				Dicha excepcion se produce en la linea 33
	 */
	@Test
	public void numberFormatExceptionEnParametroAEnElWhileCuandoNoEsNumerico()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores("texto", "", null, "");
	}
	
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Bucle y Valores Limite
	 * Descripción: nos encontramos un NumberFormatException en el parametro 'a' cuando su valor numerico
	 * 				es superior al rango de los enteros positivos
	 * 				Dicha excepcion se produce en la linea 33
	 */
	@Test
	public void numberFormatExceptionEnParametroAEnElWhileCuandExcedeLosEnterosPositivos()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores("2.3", "", null, "");
	}
	
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Bucle y Valores Limite
	 * Descripción: nos encontramos un NumberFormatException en el parametro 'a' cuando su valor numerico
	 * 				es inferior al rango de los enteros negativos
	 * 				Dicha excepcion se produce en la linea 33
	 */
	@Test
	public void numberFormatExceptionEnParametroAEnElWhileCuandExcedeLosEnterosNegativos()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores("-2147483649", "", null, "");
	}
	
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Bucle y Clase de Equivalencia de Datos
	 * Descripción: nos encontramos un NumberFormatException en el parametro 'b' cuando su valor no es numerico
	 * 				Dicha excepcion se produce en la linea 35
	 */
	@Test
	public void numberFormatExceptionEnParametroBEnElWhileCuandoNoEsNumerico()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores("1", "texto", null, "");
	}
	
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Bucle y Valores Limite
	 * Descripción: nos encontramos un NumberFormatException en el parametro 'b' cuando su valor numerico
	 * 				es superior al rango de los enteros positivos
	 * 				Dicha excepcion se produce en la linea 35
	 */
	@Test
	public void numberFormatExceptionEnParametroBEnElWhileCuandExcedeLosEnterosPositivos()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores("1", "2147483648", null, "");
	}
	
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Bucle y Valores Limite
	 * Descripción: nos encontramos un NumberFormatException en el parametro 'b' cuando su valor numerico
	 * 				es inferior al rango de los enteros negativos
	 * 				Dicha excepcion se produce en la linea 35
	 */
	@Test
	public void numberFormatExceptionEnParametroBEnElWhileCuandExcedeLosEnterosNegativos()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores("1", "-2147483649", null, "");
	}
	
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Bucle y Clase de Equivalencia de Datos
	 * Descripción: nos encontramos un NumberFormatException en el parametro 'd' cuando su valor no es numerico
	 * 				Dicha excepcion se produce en la linea 42
	 */
	@Test
	public void numberFormatExceptionEnParametroDEnElWhileCuandoNoEsNumerico()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores("2", "1", "", "texto");
	}
	
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Bucle y Valores Limite
	 * Descripción: nos encontramos un NumberFormatException en el parametro 'd' cuando su valor numerico
	 * 				es superior al rango de los enteros positivos
	 * 				Dicha excepcion se produce en la linea 42
	 */
	@Test
	public void numberFormatExceptionEnParametroDEnElWhileCuandExcedeLosEnterosPositivos()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();
		
		encuentraLosErrores.encuentraLosErrores("2", "1", "", "2147483648");
	}
	
	/**
	 * TIPO DE PRUEBA: Caja blanca
	 * SUBTIPO: Bucle y Valores Limite
	 * Descripción: nos encontramos un NumberFormatException en el parametro 'd' cuando su valor numerico
	 * 				es inferior al rango de los enteros negativos
	 * 				Dicha excepcion se produce en la linea 42
	 */
	@Test
	public void numberFormatExceptionEnParametroDEnElWhileCuandExcedeLosEnterosNegativos()
	{
		EncuentraLosErrores encuentraLosErrores = new EncuentraLosErrores();

		encuentraLosErrores.encuentraLosErrores("2", "1", "", "-2147483649");
	}
}
