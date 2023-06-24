package Orders;

public class Program {
    public static void main(String[] args) {
        Order order = new Order();

        SetValue setValue = new SetValue(order);
        setValue.inputFromConsole();

        SaveFile saveFile = new SaveFile(order);
        saveFile.saveToJson();
    }
}
