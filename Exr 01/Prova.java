public class Prova
{
	private double notaParte1;
	private double notaParte2;

	public Prova(double nt1, double nt2)
	{
		if(nt1 < 0 || nt2 < 0)
		{	
			if(nt1 < 0)
			System.out.println("Invalid value:" + nt1);

			if(nt2 < 0)
			System.out.println("Invalid value: " + nt2);	
		}

		else if(nt1+nt2 > 10)
		{
			System.out.println("The grades sum is bigger than 10: " + (nt1+nt2));
		}

		else
		{
			notaParte1 = nt1;
			notaParte2 = nt2;
		}
	}

	public double calcularNotaTotal()
	{
		return (notaParte1+notaParte2);
	}




}
