package com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.services;

import com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.entities.Order;
import org.springframework.stereotype.Service;

//Responsavel pelas operações do pedido
@Service
public class OrderService {
    ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;

    }

    public double total(Order order ){

        return (order.getBasic() - (order.getBasic()  * order.getDiscount() / 100)) + shippingService.shipment(order);


    }


}


