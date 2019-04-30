package Entidades;

public enum StatusTransacao {
	SUCESSO("sucesso"), NAOREALIZADO("NAO REALIZADO");
	private String status;

	private StatusTransacao(String s) {
		this.status = s;

	}

	public String statusObter() {
		return this.status;

	}

}
