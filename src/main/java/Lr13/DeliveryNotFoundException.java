package Lr13;

public class DeliveryNotFoundException extends Exception {
    private int orderId;

    public DeliveryNotFoundException(String message, int orderId) {
        super(message);
        this.orderId = orderId;
    }

    public int getOrderId() { return orderId; }
}