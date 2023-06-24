package Orders;

import java.util.Scanner;

public class SetValue {
    private static Scanner scanner = new Scanner(System.in);
    Order order;

    public SetValue(Order order) {
        this.order = order;
    }

    private String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public void inputFromConsole(){
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }


}
