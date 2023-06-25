package adapter;
//преобразует интерфейс одного класса в другой

public class Adapter implements MeteoSensorSimple{
    private SensorTemperature sensorTemperature;

    public Adapter(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public double getTemperature() {
        return sensorTemperature.temperature();
    }
}
