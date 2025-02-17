package setOrdenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno {

	  //atributos
	  private String nome;
	  private Long matricula;
	  private double media;

	  public Aluno(String nome, Long matricula, double media) {
	    this.nome = nome;
	    this.matricula = matricula;
	    this.media = media;
	  }

	  public String getNome() {
	    return nome;
	  }

	  public Long getMatricula() {
	    return matricula;
	  }

	  public double getMedia() {
	    return media;
	  }

	  
	  public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Aluno aluno)) return false;
	    return Objects.equals(getMatricula(), aluno.getMatricula());
	  }

	  
	  public int hashCode() {
	    return Objects.hash(getMatricula());
	  }

	  
	  public int compareTo(Aluno aluno) {
	    return nome.compareTo(aluno.getNome());
	  }

	  
	  public String toString() {
	    return "Aluno{" +
	        "nome='" + nome + '\'' +
	        ", matricula=" + matricula +
	        ", media=" + media +
	        '}';
	  }
	}

	class ComparatorNota implements Comparator<Aluno> {
	  
	  public int compare(Aluno o1, Aluno o2) {
	    return Double.compare(o1.getMedia(), o2.getMedia());
	  }
	}

