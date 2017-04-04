package br.com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso{	
	
	public Curso(String nome, Integer alunos) {
		super();
		this.nome = nome;
		this.alunos = alunos;
	}
	
	String nome;
	Integer alunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAlunos() {
		return alunos;
	}
	public void setAlunos(Integer alunos) {
		this.alunos = alunos;
	}
}

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java8", 112));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		cursos.forEach(c -> System.out.println(c.getNome()));
		cursos.stream().filter(c -> c.getAlunos() > 100).
			map(Curso::getAlunos).
			forEach(System.out::println);
	}
}
