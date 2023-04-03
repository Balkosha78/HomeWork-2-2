public class Gryffindor extends HogwartsStudent {
    private int nobility; //благородство
    private int honor;  //честь
    private int bravery;  //храбрость

    public Gryffindor(String studentFulName, int powerOfMagic, int transgress, int nobility, int honor, int bravery) {
        super(studentFulName, powerOfMagic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                ", studentFulName='" + studentFulName +
                ", powerOfMagic=" + powerOfMagic +
                ", transgress=" + transgress +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                 '\'' +
                "} " + super.toString();
    }
    private int getSkillsSum(){  //суммируем навыки
        return nobility + honor + bravery;
    }
    public static void compareSkills(Gryffindor student1 , Gryffindor student2){   //Сравниваем 2 учеников по сумме навыков
        int student1SkillsSum = student1.getSkillsSum();
        int student2SkillsSum = student2.getSkillsSum();
        if (student1SkillsSum > student2SkillsSum){
            System.out.println(student1.getStudentFulName() + " лучший Гриффиндорец, чем  " + student2.getStudentFulName());
        } else if (student1SkillsSum < student2SkillsSum){
            System.out.println(student2.getStudentFulName() + " лучший Гриффиндорец, чем  " + student1.getStudentFulName());
        } else {
            System.out.println(student1.getStudentFulName() + " и " + student2.getStudentFulName() + " одинаково хороши. ");
        }

    }
}



