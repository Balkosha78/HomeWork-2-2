 abstract public class HogwartsStudent {
    protected String studentFulName;
    protected int powerOfMagic;  // сила магии
    protected int transgress;  // трансгрессия
    public HogwartsStudent(String studentFulName, int powerOfMagic, int transgress) {
        this.studentFulName = studentFulName;
        this.powerOfMagic = powerOfMagic;
        this.transgress = transgress;
    }
    public String getStudentFulName() {
        return studentFulName;
    }
    public int getPowerOfMagic() {
        return powerOfMagic;
    }
    public int getTransgress() {
        return transgress;
    }

     private int getSkillsSum(){  //суммируем навыки
         return powerOfMagic + transgress;
     }
     public static void compareSkills(HogwartsStudent student1 , HogwartsStudent student2){   //Сравниваем 2 учеников по сумме навыков
         int student1SkillsSum = student1.getSkillsSum();
         int student2SkillsSum = student2.getSkillsSum();
         if (student1SkillsSum > student2SkillsSum){
             System.out.println(student1.getStudentFulName() + " лучший студент Хогвартса, чем  " + student2.getStudentFulName());
         } else if (student1SkillsSum < student2SkillsSum){
             System.out.println(student2.getStudentFulName() + " лучший студент Хогвартса, чем  " + student1.getStudentFulName());
         } else {
             System.out.println(student1.getStudentFulName() + " и " + student2.getStudentFulName() + " одинаково хороши. ");
         }
     }
}