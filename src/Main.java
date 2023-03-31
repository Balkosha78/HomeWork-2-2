public class Main {
    public static void main(String[] args) {
        Students[] students = {
                new Students("Гарри Поттер"),
                new Students("Гермиона Грейнджер"),
                new Students("Рон Уизли"),
                new Students("Захария Смит"),
                new Students("Седрик Диггори"),
                new Students("Джастин Финч-Флетчли"),
                new Students("Драко Малфой"),
                new Students("Грэхэм Монтегю"),
                new Students("Грегори Гойл"),
                new Students("Чжоу Чанг"),
                new Students("Падма Патил"),
                new Students("Маркус Белби"),
        };
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер", 10, 100),
                new Hogwarts("Гермиона Грейнджер", 10, 90),
                new Hogwarts("Рон Уизли", 8, 80),
                new Hogwarts("Захария Смит", 8, 70),
                new Hogwarts("Седрик Диггори", 8, 90),
                new Hogwarts("Джастин Финч-Флетчли", 8, 90),
                new Hogwarts("Драко Малфой", 10, 90),
                new Hogwarts("Грэхэм Монтегю", 8, 85),
                new Hogwarts("Грегори Гойл", 7, 70),
                new Hogwarts("Чжоу Чанг", 8, 90),
                new Hogwarts("Падма Патил", 6, 80),
                new Hogwarts("Маркус Белби", 6, 75),
        };
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 10, 100, 90, 90, 100),
                new Gryffindor("Гермиона Грейнджер", 10, 90, 90, 90, 100),
                new Gryffindor("Рон Уизли", 8, 80, 90, 90, 100),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 8, 70, 50, 60, 80),
                new Hufflepuff("Седрик Диггори", 8, 90, 60, 60, 70),
                new Hufflepuff("Джастин Финч-Флетчли", 8, 90, 55, 70, 90),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 8, 90, 50, 40, 60, 80),
                new Ravenclaw("Падма Патил", 6, 80, 60, 50, 70, 70),
                new Ravenclaw("Маркус Белби", 6, 75, 60, 70, 50, 60),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 10, 90, 90, 80, 100, 80, 100),
                new Slytherin("Грэхэм Монтегю", 8, 85, 80, 80, 90, 80, 90),
                new Slytherin("Грегори Гойл", 7, 70, 70, 80, 70, 60, 80),
        };
        PrintService printService = new PrintService();
        printService.print(students);
        printService.print(hogwarts);
        printService.print(gryffindors);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        printService.print(slytherins);
    }
}