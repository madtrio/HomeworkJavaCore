package Hw2;

public class Hufflepuff extends HogwartsStudent {
    private int hardworking;
    private int loyal;
    private int honest;
    public Hufflepuff(String name, int magicPower, int transgressionRange, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionRange);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    private int ability() {
        return hardworking + loyal + honest;
    }

    public void checkHuff(Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Пуффендуя %s лучше, чем студент Пуффендуя %s: %d и %d%n",
                    getName(),
                    hufflepuff.getName(),
                    ability1,
                    ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент Пуффендуя %s лучше, чем студент Пуффендуя %s: %d и %d%n",
                    hufflepuff.getName(),
                    getName(),
                    ability2,
                    ability1);
        } else {
            System.out.printf("Студент Пуффендуя %s такой же как и студент Пуффендуя %s: %d и %d%n",
                    hufflepuff.getName(),
                    getName(),
                    ability2,
                    ability1);
        }
    }
}
