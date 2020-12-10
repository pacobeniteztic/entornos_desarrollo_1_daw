package es.maralboran.calculadora_cientifica;

public class CalculadoraSimple
{		
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 * @return la suma entre ambos números
	 */
	public int suma(String a, String b)
	{	
		this.validaValoresDeEntrada(a, b);
		
		return Integer.valueOf(a) + Integer.valueOf(b);
	}
	
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 * @return la resta entre ambos números
	 */
	public int resta(String a, String b)
	{
		return -1; // Implementar el método de la resta
	}
	
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 * @return la multiplicacion entre ambos números
	 */
	public int multiplicacion(String a, String b)
	{
		return -1; // Implementar el método de la multiplicacion
	}
	
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 * @return la division entre ambos números
	 */
	public int division(String a, String b)
	{
		return -1; // Implementar el método de la division
	}
	
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 * @return la division entre ambos números
	 */
	public boolean aMayorQueB(String a, String b)
	{
		this.validaValoresDeEntrada(a, b);
		
		return Integer.valueOf(a) > Integer.valueOf(b);
	}
	
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 * @return la division entre ambos números
	 */
	public boolean aMenorQueB(String a, String b)
	{
		return false; // Implementar el método 'a' menor que 'b'
	}
	
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 * @return la division entre ambos números
	 */
	public boolean aIgualQueB(String a, String b)
	{
		return false; // Implementar el método 'a' mayor que 'b'
	}
	
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 */
	private void validaValoresDeEntrada(String a, String b)
	{
		if (a == null)
		{
			throw new RuntimeException("El valor de a no puede ser null");
		}
		
		if (b == null)
		{
			throw new RuntimeException("El valor de b no puede ser null");
		}
	}
}
