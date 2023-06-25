package adapter;

public class Program {
    public static void main(String[] args) {
        MS200 ms200 = new MS200(01);
        ST500Info st500Info = new ST500Info(02);
        MeteoStore meteoStore = new MeteoStore();
        meteoStore.save(ms200);
        meteoStore.save(new Adapter(st500Info));
    }
}
