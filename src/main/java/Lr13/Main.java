package Lr13;

public class Main {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        try {
            service.add(new Delivery(101, "ул. Ленина, 5", 3.5, 12));
            service.add(new Delivery(102, "пр. Рокоссовского, 10", 10, 40));
            service.add(new Delivery(103, "ул. Садовая, 7", 1.2, 5));
            service.add(new Delivery(104, "ул. Новая, 1", 2, 8));
            service.add(new Delivery(105, "ул.Победа", -2, 6));
        } catch (InvalidDeliveryDataException e) {
            System.err.println("Ошибка данных: " + e.getMessage());
        }

        try {
            service.start(101);
            service.complete(101);
            System.out.println(service.find(101));

            service.start(102);
            service.complete(102);
            System.out.println(service.find(102));

            service.start(103);
            service.complete(103);
            System.out.println(service.find(103));

            service.start(104);
            service.complete(104);
            System.out.println(service.find(104));

        } catch (DeliveryNotFoundException e) {
            System.out.println("Не найдено: " + e.getMessage()
                    + " (номер заказа " + e.getOrderId() + ")");
        } catch (DeliveryException e) {
            System.out.println("Ошибка доставки: " + e.getMessage());
        } finally {
            System.out.println("Обработка заказов завершена");
        }
    }
}