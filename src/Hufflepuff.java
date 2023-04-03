public class Hufflepuff extends HogwartsStudent { //Пуффендуй
    private int industriousness;  //трудолюбие
    private int fidelity;  //верность
    private int honesty;  // честность

    public Hufflepuff(String studentFulName, int powerOfMagic, int transgress, int industriousness, int fidelity, int honesty) {
        super(studentFulName, powerOfMagic, transgress);
        this.industriousness = industriousness;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getFidelity() {
        return fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                ", studentFulName='" + studentFulName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgress=" + transgress +
                "industriousness=" + industriousness +
                ", fidelity=" + fidelity +
                ", honesty=" + honesty +
                "} " + super.toString();
    }
    private int getSkillsSum(){   //суммируем навыки
        return industriousness + fidelity + honesty;
    }
    public static void compareSkills(Hufflepuff student1 , Hufflepuff student2){  //Сравниваем 2 учеников по сумме навыков
        int student1SkillsSum = student1.getSkillsSum();
        int student2SkillsSum = student2.getSkillsSum();
        if (student1SkillsSum > student2SkillsSum){
            System.out.println(student1.getStudentFulName() + " лучший Пуффендуец, чем  " + student2.getStudentFulName());
        } else if (student1SkillsSum < student2SkillsSum){
            System.out.println(student2.getStudentFulName() + " лучший Пуффендуец, чем  " + student1.getStudentFulName());
        } else {
            System.out.println(student1.getStudentFulName() + " и " + student2.getStudentFulName() + " одинаково хороши. ");
        }

    }
}