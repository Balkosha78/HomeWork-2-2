public class Student {
    private String student;
    private Hogwarts hogwarts;
    public Student(String student, Hogwarts hogwarts) {
        this.student = student;
        this.hogwarts = hogwarts;
    }
    public String getStudent() {
        return student;
    }
    public void setStudent(String student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Students{" +
                "student='" + student + '\'' +
                ", hogwarts=" + hogwarts.toString() +
                '}';
    }

    public Hogwarts getHogwarts() {
        return hogwarts;
    }


}