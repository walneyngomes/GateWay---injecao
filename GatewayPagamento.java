package Entidades;

public interface GatewayPagamento {
	StatusTransacao realizarPagamento(DadosCartao dados, double valor);
}
