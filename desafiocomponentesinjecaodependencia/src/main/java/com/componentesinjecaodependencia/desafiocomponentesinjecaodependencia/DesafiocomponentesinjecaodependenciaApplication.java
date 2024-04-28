package com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia;


import com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.entities.Order;
import com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.services.OrderService;
import com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafiocomponentesinjecaodependenciaApplication  implements CommandLineRunner {




	public static void main(String[] args) {
		SpringApplication.run(DesafiocomponentesinjecaodependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1309, 201D, 0D);
		ShippingService shippingService = new ShippingService();

		OrderService orderService = new OrderService(shippingService);


		//System.out.println("Frete = " + shippingService.shipment(order));

		System.out.println("Pedido Código = " + order.getCode());

		System.out.println("Valor compra = " + orderService.total(order));

	}
}
