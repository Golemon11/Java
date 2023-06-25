package builder;

public class Program {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
//                .setClientName("Name")
                .setQnt(8)
//                .setProduct("Product")
                .setPrice(1000)
                .build();
    }
}
