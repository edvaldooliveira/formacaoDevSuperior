package com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.services;

import com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.entities.Order;

//Responsavel por operações relacionado ao frete
public class ShippingService {

    public double shipment(Order order){
        if(order.getBasic() <= 100){
            return 20;
        }else if (order.getBasic()  <= 200){
            return 12;
        }else {
              return 0;
            }
        }
}
