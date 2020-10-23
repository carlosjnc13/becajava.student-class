package studantClass;
import java.util.Scanner;

public class Aluno {
	
	public Scanner Leitor = new Scanner(System.in);
	public String Nome;
	public String Curso;
	public double Nota1;
	public double Nota2;
	public double Nota3;
	public double Nota4;
	public double Media;
	
	public Aluno(String nome, String curso, double nota1, double nota2) {
		
		Nome = nome;
		Curso = curso;
		Nota1 = nota1;
		Nota2 = nota2;
	}
	
	public void getNotas(double nota3,double nota4) {
		
		Nota3 = nota3;
		Nota4 = nota4;
			
	}
	
	public void getMedia() {
		Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
		System.out.println("A media do aluno: "+ Nome +" foi " + Media);
		
	}

}
