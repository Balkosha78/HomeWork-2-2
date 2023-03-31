public class PrintService {
    public void print(Students[] students) {
        System.out.println("Список учащихся: ");
        for (int i = 0; i < students.length; i++) {
            Students student = students[i];
            System.out.println("Ученик: " + student.getStudent());
        }
        System.out.println();
    }
    public void print(Hogwarts[] hogwarts) {
        System.out.println("Список учащихся в Хогвартсе с общими навыками:  ");
        for (int i = 0; i < hogwarts.length; i++) {
            Hogwarts hogwart = hogwarts[i];
            System.out.println("Ученик: " + hogwart.getStudent() + "; сила волшебства: " + hogwart.getPowerOfMagic() +
                    "; растояние трансгрессии: " + hogwart.getTransgress());
        }
        System.out.println();
    }
    public void print(Gryffindor[] gryffindors) {
        System.out.println("Список учеников Гриффиндора со своими навыками: ");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Ученик: " + gryffindor.getStudent() + "; сила волшебства: " + gryffindor.getPowerOfMagic() +
                    "; растояние трансгрессии: " + gryffindor.getTransgress() + "; благородство: " + gryffindor.getNobility() +
                    "; честь: " + gryffindor.getHonor() + "; храбрость: " + gryffindor.getBravery() );
        }
        System.out.println();
    }
    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Список учеников Пуффендуя со своими навыками: ");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Ученик: " + hufflepuff.getStudent() + "; сила волшебства: " + hufflepuff.getPowerOfMagic() +
                    "; растояние трансгрессии: " + hufflepuff.getTransgress() + "; трудолюбие: " + hufflepuff.getIndustriousness() +
                    "; верность: " + hufflepuff.getFidelity() + "; храбрость: " + hufflepuff.getHonesty());
        }
        System.out.println();
    }
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Список учеников Когтеврана со своими навыками: ");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Ученик: " + ravenclaw.getStudent() + "; сила волшебства: " + ravenclaw.getPowerOfMagic() +
                    "; растояние трансгрессии: " + ravenclaw.getTransgress() + "; ум: "+ ravenclaw.getSmart() + "; мудрость: "+ ravenclaw.getWise() +
                    "; остроумие: " + ravenclaw.getWit() + "; творчество: " + ravenclaw.getCreativity());
        }
        System.out.println();
    }
    public void print(Slytherin[] slytherins) {
        System.out.println("Список учеников Слизерина со своими навыками: ");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Ученик: " + slytherin.getStudent() + "; сила волшебства: " + slytherin.getPowerOfMagic() +
                    "; растояние трансгрессии: " + slytherin.getTransgress() + "; хитрость: " + slytherin.getTheTrick() +
                    "; решительность: " + slytherin.getDetermination() + "; амбициозность: " + slytherin.getAmbition() +
                    "; находчивость: " + slytherin.getResourcefulness() + "; жажда власти: " + slytherin.getLustForPower());
        }
    }
}