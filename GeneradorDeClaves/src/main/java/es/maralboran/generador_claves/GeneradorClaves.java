package es.maralboran.generador_claves;

import java.util.Random;

/**
 * Clase Generadora de Claves
 */
public class GeneradorClaves
{	
	/**
	 * Lanzar el proceso
	 * 
	 * @param vocales con el número de vocales
	 * @param consonantes con el número de consonantes
	 * @param numeros con el número de números
	 */
	public void lanzarProceso(String vocales, String consonantes, String numeros)
	{
		boolean valido = this.verificarValoresDeEntrada(vocales, consonantes, numeros);
		
		if (valido)
		{
			this.lanzarGenerador(vocales, consonantes, numeros);			
		}
	}
	
	/**
	 * Verificar los valores de entrada
	 */
	private boolean verificarValoresDeEntrada(String vocales, String consonantes, String numeros)
	{
		boolean valido = true;
		
		if (vocales == null || vocales.length() == 0)
		{
			valido = false;
		}
		
		if (consonantes == null || consonantes.length() == 0)
		{
			valido = false;
		}
		
		if (numeros == null || numeros.length() == 0)
		{
			valido = false;
		}
		
		if (!valido)
		{
			System.out.println("Hay algo incorrecto en los parámetros de entrada");
		}
		
		return valido;
	}
	
	/**
	 * Lanzar el generador!
	 */
	private void lanzarGenerador(String vocales, String consonantes, String numeros)
	{
		String clave = "";
		
		// Primero las vocales
		clave = clave + this.devuelveCadenaConTipo(vocales, "aeiou");
		
		// Segundo las consonantes
		clave = clave + this.devuelveCadenaConTipo(consonantes, "bcdfghjklmnpqrstvwxyz");
		
		// Tercero los números
		clave = clave + this.devuelveCadenaConTipo(numeros, "0123456789");
		
		System.out.println("La clave generada es ... " + clave);
	}
	
	/**
	 * @param numeroDeValores con el número de valores
	 * @param conjunto con el conjunto de valores
	 * @return una cadena aleatoria
	 */
	private String devuelveCadenaConTipo(String numeroDeValores, String conjunto)
	{
		String clave = "";
		
		Random random = new Random();
		
		int longitudConjunto = conjunto.length();
		
		for (int i = 0 ; i < Integer.parseInt(numeroDeValores) ; i++)
		{
			clave = clave + conjunto.charAt(random.nextInt(longitudConjunto));
		}
		
		return clave;
	}
}
