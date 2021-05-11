package Lista3;

public class CartaoSIM {
	
	private String operadora;
	private String tamanho;
	private Integer numero;
	
	public CartaoSIM() {
		this.operadora = " ";
		this.tamanho = " ";
		this.numero = 0;
	}
	
	public CartaoSIM(String operadora, String tamanho, Integer numero) {
		this.operadora = operadora;
		this.tamanho = tamanho;
		this.numero = numero;
	}
	
	public String getOperadora() {
		return operadora;
	}
	
	public void setOperadora (String operadora) {
		this.operadora = operadora;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
