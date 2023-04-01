public class Hufflepuff extends Hogwarts { //Пуффендуй
    private int industriousness;  //трудолюбие
    private int fidelity;  //верность
    private int honesty;  // честность
    public Hufflepuff(int powerOfMagic, int transgress, int industriousness, int fidelity, int honesty) {
        super(powerOfMagic, transgress);
        this.industriousness = industriousness;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }
    public int getIndustriousness() {
        return industriousness;
    }
    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }
    public int getFidelity() {
        return fidelity;
    }
    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }
    public int getHonesty() {
        return honesty;
    }
    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", fidelity=" + fidelity +
                ", honesty=" + honesty +
                ", powerOfMagic=" + super.getPowerOfMagic() +
                ", transgress=" + super.getTransgress() +
                '}';
    }

    @Override
    public int calcAmountPointsFacultatea() {
        return this.industriousness +this.fidelity + this.honesty;
    }

    @Override
    public String getFacultatea() {
        return " Пуффендуй ";
    }
}