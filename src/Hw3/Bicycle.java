package Hw3;

public class Bicycle extends WheeledTrans implements Serviсeable {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }
    @Override
    public void check() {
        checkWheels();
    }
}
