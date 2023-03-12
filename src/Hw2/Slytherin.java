package Hw2;

public class Slytherin extends HogwartsStudent {
    private int cunning;
    private int readiness;
    private int ambitions;
    private int nahod;
    private int power;
    public Slytherin (String name, int magicPower, int transgressionRange, int cunning, int readiness, int ambitions, int nahod, int power) {
        super(name, magicPower, transgressionRange);
        this.cunning = cunning;
        this.readiness = readiness;
        this.ambitions = ambitions;
        this.nahod = nahod;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getReadiness() {
        return readiness;
    }

    public void setReadiness(int readiness) {
        this.readiness = readiness;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }

    public int getNahod() {
        return nahod;
    }

    public void setNahod(int nahod) {
        this.nahod = nahod;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    private int ability() {
        return cunning + power + nahod + ambitions;
    }

    public void checkSly(Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Слизерина %s лучше, чем студент Слизерина %s: %d и %d%n",
                    getName(),
                    slytherin.getName(),
                    ability1,
                    ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент Слизерина %s лучше, чем студент Слизерина %s: %d и %d%n",
                    slytherin.getName(),
                    getName(),
                    ability2,
                    ability1);
        } else {
            System.out.printf("Студент Слизерина %s такой же как и студент Слизерина %s: %d и %d%n",
                    slytherin.getName(),
                    getName(),
                    ability2,
                    ability1);
        }
    }
}
