public class Slytherin extends HogwartsStudent {
    private int theTrick;  // хитрость
    private int determination;  //решительность
    private int ambition;  // амбициозность
    private int resourcefulness;  // находчивость
    private int lustForPower;  // жажда власти

    public Slytherin(String studentFulName, int powerOfMagic, int transgress, int theTrick,
                     int determination, int ambition, int resourcefulness, int lustForPower) {
        super(studentFulName, powerOfMagic, transgress);
        this.theTrick = theTrick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTheTrick() {
        return theTrick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                ", studentFulName='" + studentFulName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgress=" + transgress +
                "theTrick=" + theTrick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                "} " + super.toString();
    }
    private int getSkillsSum(){   //суммируем навыки
        return theTrick + determination + ambition + resourcefulness + lustForPower;
    }
    public static void compareSkills(Slytherin student1 , Slytherin student2){   //Сравниваем 2 учеников по сумме навыков
        int student1SkillsSum = student1.getSkillsSum();
        int student2SkillsSum = student2.getSkillsSum();
        if (student1SkillsSum > student2SkillsSum){
            System.out.println(student1.getStudentFulName() + " лучший Слизеринец, чем  " + student2.getStudentFulName());
        } else if (student1SkillsSum < student2SkillsSum){
            System.out.println(student2.getStudentFulName() + " лучший Слизеринец, чем  " + student1.getStudentFulName());
        } else {
            System.out.println(student1.getStudentFulName() + " и " + student2.getStudentFulName() + " одинаково хороши. ");
        }

    }
}
