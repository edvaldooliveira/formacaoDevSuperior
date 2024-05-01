package com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia;

import com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.entities.Order;
import com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.services.OrderService;
import com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafiocomponentesinjecaodependenciaApplication implements CommandLineRunner {

	Order order;
	OrderService orderService;
	ShippingService shippingService;

	public DesafiocomponentesinjecaodependenciaApplication(Order order, OrderService orderService, ShippingService shippingService) {
		this.order = order;
		this.orderService = orderService;
		this.shippingService = shippingService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafiocomponentesinjecaodependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			System.out.println("DESAFIO: Componentes e injeção de dependência");
			System.out.print("Informe o código do pedido = ");
			int code = sc.nextInt();
			order.setCode(code);
			Integer ordercode = order.getCode();

			System.out.print("Informe o valor do produto = R$ ");
			double valorDoProduto = sc.nextDouble();
			order.setBasic(valorDoProduto);

			System.out.print("Informe o valor do desconto = R$ ");
			double valorDesconto = sc.nextDouble();
			order.setDiscount(valorDesconto);

			shippingService.shipment(order);
			double resultado = orderService.total(order);
			System.out.println("****************** Código = " + ordercode);
			System.out.printf("******************* Total = R$ %.2f%n", resultado);

			System.out.println("Deseja inserir outro pedido? (S/N)");
			String continuarStr = sc.next();
			continuar = continuarStr.equalsIgnoreCase("S");
		}

		sc.close();
	}
}

