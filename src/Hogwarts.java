public class Hogwarts extends Students {
    private int powerOfMagic;  // сила магии
    private int transgress;  // трансгрессия
    public Hogwarts(String student, int powerOfMagic, int transgress) {
        super(student);
        this.powerOfMagic = powerOfMagic;
        this.transgress = transgress;
    }
    public int getPowerOfMagic() {
        return powerOfMagic;
    }
    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }
    public int getTransgress() {
        return transgress;
    }
    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
}