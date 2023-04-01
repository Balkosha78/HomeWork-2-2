public class Hogwarts {
    private int powerOfMagic;  // сила магии
    private int transgress;  // трансгрессия
    public Hogwarts(int powerOfMagic, int transgress) {
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

    public int calcAmountPointsFacultatea() {
        return 0;
    }

    public String getFacultatea() {
        return " Хогвартс ";
    }

    public int calcAmountPointsSchool() {
        return this.powerOfMagic + this.transgress;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "powerOfMagic=" + powerOfMagic +
                ", transgress=" + transgress +
                '}';
    }
}