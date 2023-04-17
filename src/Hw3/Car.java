package Hw3;

public class Car extends WheeledTrans implements Engineable, Serviсeable {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у автомобиля");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у автомобиля");
    }

    @Override
    public void check() {
        checkWheels();
        checkEngine();
        }
    }
