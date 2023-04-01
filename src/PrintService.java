public class PrintService {
    public void print(Student[] students) {
        System.out.println("Список учащихся в Хогвартсе с общими навыками:  ");
        for (Student student : students) {
            System.out.println("Ученик: " + student.getStudent() + student.getHogwarts());
        }
        System.out.println();
    }
}
