package com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia;


import com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.entities.Order;
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

		Order order = new Order(1034, 0D, 20D);
		ShippingService shippingService = new ShippingService();

		System.out.println("Resultado = " + shippingService.shipment(order));




	}
}
