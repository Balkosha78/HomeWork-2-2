public class Main {

    public static void main(String[] args) {
        Gryffindor Harry = new Gryffindor("Гарри Поттер", 10, 100, 90, 90, 100);
        Gryffindor Hermione = new Gryffindor("Гермиона Грейнджер", 60, 90, 90, 90, 100);
        Gryffindor Ron = new Gryffindor("Рон Уизли", 8, 80, 90, 60, 100);
        Hufflepuff Zaharia = new Hufflepuff("Захария Смит", 8, 70, 50, 60, 80);
        Hufflepuff Cedric = new Hufflepuff("Седрик Диггори", 8, 90, 60, 60, 70);
        Hufflepuff Justin = new Hufflepuff("Джастин Финч-Флетчли", 8, 90, 55, 70, 90);
        Slytherin Draco = new Slytherin("Драко Малфой",10, 90, 90, 80, 100, 80, 100);
        Slytherin Graham = new Slytherin("Грэхэм Монтегю", 8, 85, 80, 80, 90, 80, 90);
        Slytherin Gregory = new Slytherin("Грегори Гойл", 7, 70, 70, 80, 70, 60, 80);
        Ravenclaw Cho = new Ravenclaw("Чжоу Чанг", 8, 90, 50, 40, 60, 80);
        Ravenclaw Padma = new Ravenclaw("Падма Патил", 6, 80, 60, 50, 70, 70);
        Ravenclaw Marcus = new Ravenclaw("Маркус Белби", 6, 75, 60, 70, 50, 60);

        Gryffindor.compareSkills(Harry, Hermione);
        Hufflepuff.compareSkills(Zaharia, Justin);
        Slytherin.compareSkills(Draco, Graham);
        Ravenclaw.compareSkills(Padma, Marcus);
        HogwartsStudent.compareSkills(Harry, Gregory);
    }
}