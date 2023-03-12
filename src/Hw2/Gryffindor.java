package Hw2;

public class Gryffindor extends Hogwarts {
    private int blago;
    private int chest;
    private int bravery;
    public Gryffindor(String name, int magicPower, int transgressionRange, int blago, int chest, int bravery) {
        super(name, magicPower, transgressionRange);
        this.blago = blago;
        this.chest = chest;
        this.bravery = bravery;
    }

    public int getBlago() {
        return blago;
    }

    public void setBlago(int blago) {
        this.blago = blago;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

}
