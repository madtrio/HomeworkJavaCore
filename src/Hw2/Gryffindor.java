package Hw2;

public class Gryffindor extends HogwartsStudent {
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

    private int ability() {
        return chest + bravery + blago;
    }

    public void checkGry(Gryffindor gryffindor) {
        int ability1 = ability();
        int ability2 = gryffindor.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Гриффиндора %s лучше, чем студент Гриффиндора %s: %d и %d%n",
                    getName(),
                    gryffindor.getName(),
                    ability1,
                    ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент Гриффиндора %s лучше, чем студент Гриффиндора %s: %d и %d%n",
                    gryffindor.getName(),
                    getName(),
                    ability2,
                    ability1);
        } else {
            System.out.printf("Студент Гриффиндора %s такой же как и студент Гриффиндора %s: %d и %d%n",
                    gryffindor.getName(),
                    getName(),
                    ability2,
                    ability1);
        }
    }
    }
