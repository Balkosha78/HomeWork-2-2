public class Gryffindor extends Hogwarts {
    private int nobility; //благородство
    private int honor;  //честь
    private int bravery;  //храбрость

    public Gryffindor(int powerOfMagic, int transgress, int nobility, int honor, int bravery) {
        super(powerOfMagic, transgress);
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

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", powerOfMagic=" + super.getPowerOfMagic() +
                ", transgress=" + super.getTransgress() +
                '}';
    }

    @Override
    public int calcAmountPointsFacultatea() {
        return this.bravery + this.honor + this.nobility;
    }

    @Override
    public String getFacultatea() {
        return " Гриффиндор ";
    }
}
