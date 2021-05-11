package Lista5;

import java.time.LocalDate;

public class Bolsista extends Aluno {
	
	private Double valor;
	
	public Bolsista() {
		super();
		this.valor = 0.0;
	}
	
	public Bolsista(String nome, LocalDate nascimento, String prontuario, String email, Double valor) {
		super(nome, nascimento, prontuario, email);
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "[ Valor: " + valor + "]";
	}

}
