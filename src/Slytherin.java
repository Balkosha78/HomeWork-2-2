public class Slytherin extends Hogwarts {
    private int theTrick;  // хитрость
    private int determination;  //решительность
    private int ambition;  // амбициозность
    private int resourcefulness;  // находчивость
    private int lustForPower;  // жажда власти

    public Slytherin(int powerOfMagic, int transgress, int theTrick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(powerOfMagic, transgress);
        this.theTrick = theTrick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTheTrick() {
        return theTrick;
    }

    public void setTheTrick(int theTrick) {
        this.theTrick = theTrick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public int calcAmountPointsFacultatea() {
        return this.theTrick +
                this.determination +
                this.ambition +
                this.resourcefulness +
                this.lustForPower;
    }

    @Override
    public String getFacultatea() {
        return " Слизерин ";
    }
}
