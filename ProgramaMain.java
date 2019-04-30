package Entidades;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ProgramaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryGateway formaPagamento= new FactoryGateway();
		formaPagamento.obterGateway("PayPagmento");
		DadosCartao cartao = new DadosCartao();
		cartao.setNome("Walney Negreiros");
		cartao.setValor(32.2);
		cartao.setCpf("059.987.234-34");
		ProcessaCompra compra = new ProcessaCompra(formaPagamento.obterGateway("PayPagmento"));
        compra.realizaPagamento(cartao, 3.20);		


	}

}
