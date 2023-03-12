package Hw2;

public class Main {
    public static void main(String[] args) {
        Gryffindor[] student1 = {
                new Gryffindor("Гарри Поттер", 10,11,11,11,11),
                new Gryffindor("Гермиона Грейнджер", 111,111,111,111,111),
                new Gryffindor("Рон Уизли", 11,1,1,11,11),
        };
        Slytherin[] student2 = {
                new Slytherin("Драко Малфой", 10,11,11,11,11,11,11 ),
                new Slytherin("Грэхэм Монтегю", 111,101,111,111,111,111,111),
                new Slytherin("Грегори Гойл", 11,1,1,11,11,11,1),
        };
        Hufflepuff[] student3 = {
                new Hufflepuff("Захария Смит", 10,11,11,11,11),
                new Hufflepuff("Седрик Диггори", 111,101,111,111,111),
                new Hufflepuff("Джастин Финч-Флетчли", 11,1,1,11,11),
        };
        Ravenclaw[] student4 = {
                new Ravenclaw("Чжоу Чанг", 10,11,11,11,11,22),
                new Ravenclaw("Падма Патил", 111,101,111,111,111,222),
                new Ravenclaw("Маркус Белби", 11,1,1,11,11,22),
        };
    }
}