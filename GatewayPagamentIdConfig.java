package Entidades;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayPagamentIdConfig {
	@Bean(name = "PayPal")
	public GatewayPagamento obterPalPal() {
		return new PaypalGateway();

	}

	@Bean(name = "PagSeguro")
	public GatewayPagamento obterPagSeguro() {
		return new MercadoPagoGateway();

	}

	@Bean(name = "MercadoPagoGateway")
	public GatewayPagamento obterMercadoPagoGatewat() {
		return new PagSeguroGateway();

	}

}
