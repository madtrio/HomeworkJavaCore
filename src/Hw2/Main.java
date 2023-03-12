package Hw2;

public class Main {
    public static void main(String[] args) {
        Gryffindor[] studentGry = {
                new Gryffindor("Гарри Поттер", 10, 11, 11, 11, 11),
                new Gryffindor("Гермиона Грейнджер", 54, 13, 52, 54, 64),
                new Gryffindor("Рон Уизли", 11, 1, 1, 11, 11),
        };
        Slytherin[] studentSly = {
                new Slytherin("Драко Малфой", 10, 11, 11, 11, 11, 11, 11),
                new Slytherin("Грэхэм Монтегю", 111, 41, 53, 12, 41, 43, 12),
                new Slytherin("Грегори Гойл", 11, 1, 1, 11, 11, 11, 1),
        };
        Hufflepuff[] studentHuff = {
                new Hufflepuff("Захария Смит", 10, 11, 11, 11, 11),
                new Hufflepuff("Седрик Диггори", 84, 13, 64, 14, 63),
                new Hufflepuff("Джастин Финч-Флетчли", 11, 1, 1, 11, 11),
        };
        Ravenclaw[] studentRav = {
                new Ravenclaw("Чжоу Чанг", 10, 11, 11, 11, 11, 22),
                new Ravenclaw("Падма Патил", 75, 95, 37, 15, 41, 63),
                new Ravenclaw("Маркус Белби", 11, 1, 1, 11, 11, 22),
        };
        studentRav[1].print();
        studentRav[1].checkRav(studentRav[2]);
        studentHuff[1].checkHuff(studentHuff[2]);
    }

}