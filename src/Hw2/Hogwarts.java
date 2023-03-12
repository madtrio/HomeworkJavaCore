package Hw2;

import java.sql.SQLOutput;

public abstract class HogwartsStudent {

    private String name;
    private int magicPower;
    private int transgressionRange;

    public HogwartsStudent (String name, int magicPower, int transgressionRange) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionRange = transgressionRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }

    private int ability() {
        return magicPower + transgressionRange;
    }

    public void checkHog(HogwartsStudent hogwartsStudent) {
        int ability1 = ability();
        int ability2 = hogwartsStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d и %d%n", getName(), hogwartsStudent.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d и %d%n", hogwartsStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же как и студент %s: %d и %d%n", hogwartsStudent.getName(), getName(), ability2, ability1);
        }
    }
}
