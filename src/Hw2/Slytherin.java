package Hw2;

public class Slytherin extends Hogwarts {
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
}
