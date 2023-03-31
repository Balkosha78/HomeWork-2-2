public class Hufflepuff extends Hogwarts { //Пуффендуй
    private int industriousness;  //трудолюбие
    private int fidelity;  //верность
    private int honesty;  // честность
    public Hufflepuff(String student, int powerOfMagic, int transgress, int industriousness, int fidelity, int honesty) {
        super(student, powerOfMagic, transgress);
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
}