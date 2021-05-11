package Lista5;

import java.time.LocalDate;

public class Aluno extends Pessoa{
	
	private String prontuario;
	private String email;
	
	public Aluno() {
		super();
		this.prontuario = "";
		this.email = "";
	}
	
	public Aluno (String nome, LocalDate nascimento, String prontuario, String email) {
		super(nome, nascimento);
		this.prontuario = prontuario;
		this.email = email;
	}

	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "[Prontuário: " + prontuario + ", Email: " + email + "]";
	}
	
	

}
