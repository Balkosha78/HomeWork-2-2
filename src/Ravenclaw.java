public class Ravenclaw extends HogwartsStudent { //Когтевран
    private int smart;  //умный
    private int wise;  // мудрый
    private int wit; // остроумность
    private int creativity;  //творчество

    public Ravenclaw(String studentFulName, int powerOfMagic, int transgress, int smart, int wise, int wit, int creativity) {
        super(studentFulName, powerOfMagic, transgress);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                ", studentFulName='" + studentFulName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgress=" + transgress +
                "smart=" + smart +
                ", wise=" + wise +
                ", wit=" + wit +
                ", creativity=" + creativity +
                "} " + super.toString();
    }
    private int getSkillsSum(){   //суммируем навыки
        return smart + wise + wit + creativity;
    }
    public static void compareSkills(Ravenclaw student1 , Ravenclaw student2){  //Сравниваем 2 учеников по сумме навыков
        int student1SkillsSum = student1.getSkillsSum();
        int student2SkillsSum = student2.getSkillsSum();
        if (student1SkillsSum > student2SkillsSum){
            System.out.println(student1.getStudentFulName() + " лучший Когтевранец, чем  " + student2.getStudentFulName());
        } else if (student1SkillsSum < student2SkillsSum){
            System.out.println(student2.getStudentFulName() + " лучший Когтевранец, чем  " + student1.getStudentFulName());
        } else {
            System.out.println(student1.getStudentFulName() + " и " + student2.getStudentFulName() + " одинаково хороши. ");
        }

    }
}