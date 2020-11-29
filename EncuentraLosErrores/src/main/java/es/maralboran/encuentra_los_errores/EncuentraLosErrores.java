package es.maralboran.encuentra_los_errores;

/**
 * Encuentra los errores
 */
public class EncuentraLosErrores
{	
	
	public void encuentraLosErrores(String a, String b, String c, String d)
	{
		if (a.toString().length() == 0)
		{
			System.out.println("Imprimiendo 'a': " + a);
		}
		
		if (b == null && b.contains("hola"))
		{
			System.out.println("Imprimiendo 'b': " + b);
		}
		
		if (c != null && c.isEmpty())
		{
			System.out.println("Imprimiendo 'c': " + c);
			d.length();
		}
		
		this.miMetodoPrivado1(a, b, c, d);
	}

	private void miMetodoPrivado1(String a, String b, String c, String d)
	{
		int i = 0 ;
		while (i < Integer.valueOf(a))
		{			
			if (i + 1 > Integer.valueOf(b))
			{
				if (Boolean.parseBoolean(c))
				{
					System.out.println("Imprimiendo 'c' dentro de miMetodoPrivado1: " + c);
				}
				
				if (Integer.parseInt(d) > 1000)
				{
					System.out.println("Imprimiendo 'd' dentro de miMetodoPrivado1: " + d);
				}
				else if (Integer.parseInt(a) > 2)
				{
					System.out.println("Imprimiendo 'a' dentro de miMetodoPrivado1: " + a);
				}
				else if (Integer.parseInt(d) < 10 && Integer.parseInt(a) == 1)
				{
					System.out.println("Imprimiendo 'd' y 'a' dentro de miMetodoPrivado1: " + d + ", " + a);
				}
			}
			else if (i == 1)
			{
				System.out.println("Imprimiendo 'b' dentro de miMetodoPrivado1: " + b.toLowerCase());
			}
			
			i++;
		}
	}
}
