package Hw2;

public class Ravenclaw extends HogwartsStudent {
    private int smartness;
    private int wiseness;
    private int quickwitted;

    private int creativeness;
    public Ravenclaw (String name, int magicPower, int transgressionRange, int smartness, int wiseness, int quickwitted, int creativeness) {
        super(name, magicPower, transgressionRange);
        this.smartness = smartness;
        this.wiseness = wiseness;
        this.quickwitted = quickwitted;
        this.creativeness = creativeness;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public int getWiseness() {
        return wiseness;
    }

    public void setWiseness(int wiseness) {
        this.wiseness = wiseness;
    }

    public int getQuickwitted() {
        return quickwitted;
    }

    public void setQuickwitted(int quickwitted) {
        this.quickwitted = quickwitted;
    }

    public int getCreativeness() {
        return creativeness;
    }

    public void setCreativeness(int creativeness) {
        this.creativeness = creativeness;
    }
    private int ability() {
        return smartness + creativeness + quickwitted + wiseness;
    }

    public void checkRav(Ravenclaw ravenclaw) {
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Когтеврана %s лучше, чем студент Когтеврана %s: %d и %d%n",
                    getName(),
                    ravenclaw.getName(),
                    ability1,
                    ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент Когтеврана %s лучше, чем студент Когтеврана %s: %d и %d%n",
                    ravenclaw.getName(),
                    getName(),
                    ability2,
                    ability1);
        } else {
            System.out.printf("Студент Когтеврана %s такой же как и студент Когтеврана %s: %d и %d%n",
                    ravenclaw.getName(),
                    getName(),
                    ability2,
                    ability1);
        }
    }
}
