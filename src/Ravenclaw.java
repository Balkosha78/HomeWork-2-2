public class Ravenclaw extends Hogwarts { //Когтевран
    private int smart;  //умный
    private int wise;  // мудрый
    private int wit; // остроумность
    private int creativity;  //творчество
    public Ravenclaw(int powerOfMagic, int transgress, int smart, int wise, int wit, int creativity) {
        super(powerOfMagic, transgress);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creativity = creativity;
    }
    public int getSmart() {
        return smart;
    }
    public void setSmart(int smart) {
        this.smart = smart;
    }
    public int getWise() {
        return wise;
    }
    public void setWise(int wise) {
        this.wise = wise;
    }
    public int getWit() {
        return wit;
    }
    public void setWit(int wit) {
        this.wit = wit;
    }
    public int getCreativity() {
        return creativity;
    }

    public int calcAmountBall() {
        return this.smart + this.wise + this.wit + this.creativity;
    }
    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public int calcAmountPointsFacultatea() {
        return this.smart +
                this.wise +
                this.wit +
                this.creativity;
    }

    @Override
    public String getFacultatea() {
        return " Когтевран ";
    }
}