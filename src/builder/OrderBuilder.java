package builder;

public class OrderBuilder {

    private Order order;

    public OrderBuilder() {
        order = new Order();
    }

    public Order build() {
        if (order.getQnt() <= 0) {
            throw new RuntimeException("Кол-вотовара указано некорректно");
        }
        return order;
    }

    public OrderBuilder setClientName(String clientName) {
        order.setClientName(clientName);
        return this;
    }

    public OrderBuilder setProduct(String product) {
        order.setProduct(product);
        return this;
    }

    public OrderBuilder setQnt(int qnt) {
        order.setQnt(qnt);
        return this;
    }

    public OrderBuilder setPrice(int price) {
        order.setPrice(price);
        return this;
    }

}
