package badCode.i;

public class Bicycle implements Transport {
    @Override
    public void start() {
        // запустить велосипед
    }

    @Override
    public void stop() {
        // остановить велосипед
    }

    @Override
    public void accelerate() {
        // ускорить велосипед
    }

    @Override
    public void brake() {
        // замедлить велосипед
    }

    @Override
    public void refuel() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void honk() {
        throw new RuntimeException("Not implemented");
    }
}
