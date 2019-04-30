package Entidades;

public class PaypalGateway implements GatewayPagamento {

	public StatusTransacao realizarPagamento(DadosCartao dados, double valor) {
		StatusTransacao s = null;

		if (dados.getValor() == valor) {
			s = s.SUCESSO;
		} else if (dados.getValor() > valor) {
			double diferenca = dados.getValor() - valor;
			dados.setValor(-diferenca);
			s = s.SUCESSO;

		} else {
			s = s.NAOREALIZADO;
		}
		return s;
	}

}
