package Entidades;

import org.springframework.beans.factory.annotation.Autowired;

public class ProcessaCompra {
	@Autowired
	GatewayPagamento pagamento;

	public ProcessaCompra(GatewayPagamento p) {
		this.pagamento = p;
	}

	public void realizaPagamento(DadosCartao dados, double valor) {

		System.out.print("STATUS COMPRA" + pagamento.realizarPagamento(dados, valor));
	}

}
