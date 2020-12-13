package es.maralboran.calculadora_cientifica;

public class CalculadoraDeCaracteres
{
	/**
	 * @param caracter
	 * @return el codigo ASCII asociado al caracter
	 */
	public int charToAscii(char caracter)
	{
		return (int) caracter;
	}
	
	/**
	 * @param codigoAscii
	 * @return el caracter asociado al codigo ascii
	 */
	public char asciiToChar(int codigoAscii)
	{
		return (char) codigoAscii;
	}
	
	/**
	 * @param caracteres
	 * @return array con codigos ascii
	 */
	public int[] charsToAsciis(char[] caracteres)
	{
		if (caracteres == null)
		{
			throw new RuntimeException("Los caracteres de entrada son nulos");
		}
		
		int[] asciis = new int[caracteres.length];
		
		for (int i=0 ; i < caracteres.length ; i++)
		{
			asciis[i] = this.charToAscii(caracteres[i]);
			
			System.out.println("El carácter '" + caracteres[i] + "' equivale al código ASCII: " + asciis[i]);
		}
		
		return asciis;
	}
	
	/**
	 * @param codigosAscii
	 * @return array con caracteres
	 */
	public char[] asciisToChars(int[] codigosAscii)
	{
		if (codigosAscii == null)
		{
			throw new RuntimeException("Los codigos ascii de entrada son nulos");
		}
		
		char[] caracteres = new char[codigosAscii.length];
		
		for (int i=0 ; i < codigosAscii.length ; i++)
		{
			caracteres[i] = this.asciiToChar(codigosAscii[i]);
			
			System.out.println("El código ascii " + codigosAscii[i] + " equivale al carácter: '" + caracteres[i] + "'");
		}
		
		return caracteres;
	}
	
	/**
	 * IMPORTANTE: ESTE MÉTODO NO ES NECESARIO TESTEARSE CON JUNIT, ES SOLO PARA QUE VEAIS CÓMO FUNCIONA
	 * @param args
	 */
	public static void main(String[] args)
	{
		CalculadoraDeCaracteres calculadoraDeCaracteres = new CalculadoraDeCaracteres();
	
		char caracter = 'a';
		int codigoAscii = calculadoraDeCaracteres.charToAscii(caracter);
		
		System.out.println("1. El carácter '" + caracter + "' equivale al código ASCII: " + codigoAscii);
		System.out.println("2. El código ascii " + codigoAscii + " equivale al carácter: '" + calculadoraDeCaracteres.asciiToChar(codigoAscii) + "'");
		
		char[] caracteres = new char[] {'a', 'b', 'c', 'd'};
		
		System.out.println("3. Los caracteres {'a','b','c','d'} equivalen a los códigos ASCII siguientes:");
		int[] codigosAscii = calculadoraDeCaracteres.charsToAsciis(caracteres);
		
		System.out.println("4. Los códigos ASCII {97, 98, 99, 100} equivalen a los caracteres siguientes:");
		calculadoraDeCaracteres.asciisToChars(codigosAscii);
	}
}
