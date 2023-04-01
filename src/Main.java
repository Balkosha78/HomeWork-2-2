public class Main {
        public static void comparateStudetsFacultatea(Student student1, Student student2) {
//        Проверяем что два ученика принадлежат одному факультету
        Hogwarts facStudent1 = student1.getHogwarts();
        Hogwarts facStudent2 = student2.getHogwarts();
        if (facStudent1.getClass() == facStudent2.getClass()) {
            if (facStudent1.calcAmountPointsFacultatea() > facStudent2.calcAmountPointsFacultatea()) {
                System.out.println(student1.getStudent() + facStudent1.getFacultatea() +
                        " лучше чем " +
                        student2.getStudent() +
                        facStudent2.getFacultatea());
            } else {
                System.out.println(student2.getStudent() + facStudent2.getFacultatea()
                        + " лучше чем " +
                        student1.getStudent() +
                        facStudent1.getFacultatea());
            }
        }
    }
    public static void comparateStudetsSchool(Student student1, Student student2) {
        Hogwarts facStudent1 = student1.getHogwarts();
        Hogwarts facStudent2 = student2.getHogwarts();
        if (facStudent1.calcAmountPointsSchool()> facStudent2.calcAmountPointsSchool()) {
            System.out.println(student1.getStudent() +
                    facStudent1.getFacultatea() +
                    " лучше чем " +
                    student2.getStudent() +
                    facStudent2.getFacultatea());
        } else {
            System.out.println(student2.getStudent() +
                    facStudent2.getFacultatea() +
                    " лучше чем " +
                    student1.getStudent() +
                    facStudent1.getFacultatea());
        }
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student("Гарри Поттер", new Gryffindor(10, 100, 90,90, 100)),
                new Student("Гермиона Грейнджер", new Gryffindor(60, 90, 90, 90, 100)),
                new Student("Рон Уизли", new Gryffindor( 8, 80, 90, 60, 100)),
                new Student("Захария Смит", new Hufflepuff(8, 70, 50, 60, 80)),
                new Student("Седрик Диггори", new Hufflepuff(8, 90, 60, 60, 70)),
                new Student("Джастин Финч-Флетчли", new Hufflepuff(8, 90, 55, 70, 90)),
                new Student("Драко Малфой", new Slytherin( 10, 90, 90, 80, 100, 80, 100)),
                new Student("Грэхэм Монтегю", new Slytherin(8, 85, 80, 80, 90, 80, 90)),
                new Student("Грегори Гойл", new Slytherin(7, 70, 70, 80, 70, 60, 80)),
                new Student("Чжоу Чанг", new Ravenclaw(8, 90, 50, 40, 60, 80)),
                new Student("Падма Патил", new Ravenclaw(6, 80, 60, 50, 70, 70)),
                new Student("Маркус Белби", new Ravenclaw(6, 75, 60, 70, 50, 60)),
        };
        System.out.println();
        PrintService printService = new PrintService();
        printService.print(students);

        comparateStudetsFacultatea(students[0], students[2]);
        comparateStudetsSchool(students[2], students[9]);
    }
}