public class Aluno
{
	private Prova prova1;
	private Prova prova2;

	public Aluno(Prova p1, Prova p2)
	{
		prova1 = p1;
		prova2 = p2;
	}


	public double calcularMedia()
	{
		double nt1 = prova1.calcularNotaTotal();
		double nt2 = prova2.calcularNotaTotal();

		double media = (nt1+nt2)/2;

		return media;
	}




}
