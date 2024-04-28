package com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.services;

import com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.entities.Order;

//Responsavel por operações relacionado a frete
//Serviço de entrega
public class ShippingService {


    //Método responsavel por operaçoes relacionado a frete
    public double shipment(Order order){
        if(order.getBasec() <= 100){
            return 20;
        }else if (order.getBasec()  <= 200){
            return 12;
        }else {
              return 0;
            }
        }
}
