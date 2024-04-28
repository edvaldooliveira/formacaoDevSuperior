package com.componentesinjecaodependencia.desafiocomponentesinjecaodependencia.entities;

//clase de pedido
public class Order {
    private Integer code;
    private Double basec;
    private Double discount;

    public Order() {

    }

    public Order(Integer code, Double basec, Double discount) {
        this.code = code;
        this.basec = basec;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasec() {
        return basec;
    }

    public void setBasec(Double basec) {
        this.basec = basec;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
