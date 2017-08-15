import java.util.ArrayList;

public class Turma
{

	private ArrayList<Aluno> students = new ArrayList<Aluno>();
	
	public Turma()
	{ }

	public void addAluno(Aluno al)
	{
		students.add(al);
	}

	public double calcularMedia()
	{
		double gradeSum = 0.0;
		int sz = students.size();

		for(int i = 0; i < sz; i++)
		{
			Aluno a = students.get(i);

			gradeSum += a.calcularMedia();			
		}

		return (gradeSum/sz);
	}

}

