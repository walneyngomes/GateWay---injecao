package Entidades;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class FactoryGateway {
 
	public GatewayPagamento obterGateway(String tipo) {
		GatewayPagamento gate = null;

		if ("PayPagmento".equals(tipo)) {
			AbstractApplicationContext context = instanceAnnotion();
			gate = (GatewayPagamento) context.getBean("PayPal");

		} else if ("PagSeguro".equals(tipo)) {
			AbstractApplicationContext context = instanceAnnotion();
			gate = (GatewayPagamento) context.getBean("PagSeguro");

		} else if ("MercadoPagoGateway".equals(tipo)) {
			AbstractApplicationContext context = instanceAnnotion();
			gate = (GatewayPagamento) context.getBean("MercadoPagoGateway");

		}
		return gate;
	}

	private AbstractApplicationContext instanceAnnotion() {
		return new AnnotationConfigApplicationContext(GatewayPagamentIdConfig.class);
	}

}
