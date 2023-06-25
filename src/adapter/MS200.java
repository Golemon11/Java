package adapter;

public class MS200 implements MeteoSensor{
    private int id;

    public MS200(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getTemperature() {
        return 25;
    }

    @Override
    public double getHumidity() {
        return 70;
    }

    @Override
    public double getPressure() {
        return 760;
    }
}
