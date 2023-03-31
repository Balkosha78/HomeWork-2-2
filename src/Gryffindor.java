public class Gryffindor extends Hogwarts {
    private int nobility; //благородство
    private int honor;  //честь
    private int bravery;  //храбрость
    public Gryffindor(String student, int powerOfMagic, int transgress, int nobility, int honor, int bravery) {
        super(student, powerOfMagic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getBravery() {
        return bravery;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}