package Lista3;

public class Mobile {
	
	private String modelo;
	private String marca;
	private CartaoSIM cartao;
	
	public Mobile() {
		this.modelo = " ";
		this.marca = " ";
		this.cartao = new CartaoSIM();
	}
	
	public Mobile(String modelo, String marca, CartaoSIM cartao) {
		this.modelo = modelo;
		this.marca = marca;
		this.cartao = cartao;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public CartaoSIM getCartao() {
		return cartao;
	}
	
	public void setCartao(CartaoSIM cartao) {
		this.cartao = cartao;
	}

}
