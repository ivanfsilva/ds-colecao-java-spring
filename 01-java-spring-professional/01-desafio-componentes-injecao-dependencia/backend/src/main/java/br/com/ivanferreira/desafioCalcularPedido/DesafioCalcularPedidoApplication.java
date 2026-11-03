package br.com.ivanferreira.desafioCalcularPedido;

import br.com.ivanferreira.desafioCalcularPedido.entities.Order;
import br.com.ivanferreira.desafioCalcularPedido.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class DesafioCalcularPedidoApplication implements CommandLineRunner {

	private final OrderService orderService;

	public DesafioCalcularPedidoApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioCalcularPedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);

		// Exemplo 1
		Order order1 = new Order(1034, 150.00, 20.0);
		System.out.printf("Pedido código %d%n", order1.getCode());
		System.out.printf("Valor total: R$ %.2f%n%n", orderService.total(order1));

		// Exemplo 2
		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.printf("Pedido código %d%n", order2.getCode());
		System.out.printf("Valor total: R$ %.2f%n%n", orderService.total(order2));

		// Exemplo 3
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.printf("Pedido código %d%n", order3.getCode());
		System.out.printf("Valor total: R$ %.2f%n%n", orderService.total(order3));
	}
}