package demo;

public class Numero
{
	
	private int valor;	
	
	public Numero(int v)
	{
		valor = v;
	}
	
	public Numero()
	{
	}
	
	public int getValor()
	{
		return valor;
	}

	public void setValor(int v)
	{
		valor=v;
	}

	public boolean esPar()
	{
		return valor%2==0;
	}
	
	public static boolean esPar(int n)
	{
		return n%2==0;
	}
	
	public boolean esImpar()
	{
		return !esPar();
	}
	
}
