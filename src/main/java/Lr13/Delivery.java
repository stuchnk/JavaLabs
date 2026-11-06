package Lr13;

public class Delivery {
    private int orderId;
    private String address;
    private double weight;
    private double distance;
    private String status;

    public Delivery(int orderId, String address, double weight, double distance)
            throws InvalidDeliveryDataException {

        this.orderId = orderId;
        this.address = address;
        setWeight(weight);
        setDistance(distance);
        this.status = "Создана";
    }

    public int getOrderId() {
        return orderId;
    }

    public String getAddress() {
        return address;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }

    public String getStatus() {
        return status;
    }

    public void setWeight(double weight) throws InvalidDeliveryDataException {
        if (weight <= 0) {
            throw new InvalidDeliveryDataException(
                    "Вес должен быть больше 0: " + weight);
        }
        this.weight = weight;
    }

    public void setDistance(double distance) throws InvalidDeliveryDataException {
        if (distance <= 0) {
            throw new InvalidDeliveryDataException(
                    "Расстояние должно быть больше 0: " + distance);
        }
        this.distance = distance;
    }

    public void startDelivery() throws DeliveryException {
        if (!status.equals("Создана")) {
            throw new DeliveryException(
                    "Нельзя начать доставку " + orderId
                            + ", текущий статус: " + status);
        }
        status = "В пути";
    }

    public void completeDelivery() throws DeliveryException {
        if (!status.equals("В пути")) {
            throw new DeliveryException(
                    "Нельзя завершить доставку " + orderId
                            + ", текущий статус: " + status);
        }
        status = "Доставлена";
    }

    @Override
    public String toString() {
        return "Delivery{orderId=" + orderId
                + ", address=" + address
                + ", weight=" + weight
                + ", distance=" + distance
                + ", status=" + status + "}";
    }
}