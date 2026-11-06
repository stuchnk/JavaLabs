package Lr13;

import java.util.ArrayList;
import java.util.List;

public class DeliveryService {
    private List<Delivery> deliveries = new ArrayList<Delivery>();

    public void add(Delivery delivery) {
        deliveries.add(delivery);
    }

    public Delivery find(int orderId) throws DeliveryNotFoundException {
        for (Delivery d : deliveries) {
            if (d.getOrderId() == orderId) {
                return d;
            }
        }
        throw new DeliveryNotFoundException("Доставка не найдена: " + orderId, orderId);
    }

    public void start(int orderId) throws DeliveryNotFoundException, DeliveryException {
        find(orderId).startDelivery();
    }

    public void complete(int orderId) throws DeliveryNotFoundException, DeliveryException {
        find(orderId).completeDelivery();
    }
}
