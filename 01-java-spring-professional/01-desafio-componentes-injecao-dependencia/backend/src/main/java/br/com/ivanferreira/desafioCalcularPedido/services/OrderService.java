package br.com.ivanferreira.desafioCalcularPedido.services;

import br.com.ivanferreira.desafioCalcularPedido.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        double discountValue = order.getBasic() * (order.getDiscount() / 100.0);
        double netBasic = order.getBasic() - discountValue;
        double shippingCost = shippingService.shipment(order);

        return netBasic + shippingCost;
    }
}
