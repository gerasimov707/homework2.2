package compass;

public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirsForPower;

    public SlytherinStudent(String name, int magic, int trasgression, int cunning, int determination, int ambition, int ingenuity, int thirsForPower) {
        super(name, magic, trasgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirsForPower = thirsForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
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

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirsForPower() {
        return thirsForPower;
    }

    public void setThirsForPower(int thirsForPower) {
        this.thirsForPower = thirsForPower;
    }
    public void compareSlytherin(SlytherinStudent slytherinStudent){
        int ability1 = ability();
        int ability2= slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("student %s lyche stydenta %s%n", getName(), slytherinStudent.getName());
        }else if (ability2>ability1) {
            System.out.printf("student %s lyche stydenta %s%n",slytherinStudent.getName(), getName());
        }else {
            System.out.printf("student %s takoi ze, kak %s%n", slytherinStudent.getName(), getName());
        }
    }

    public int ability() {
        return cunning+ determination+ ambition+ ingenuity+ thirsForPower;
    }

    @Override
    public String toString() {
        return String.format("%s; hitrost:%d; reshitelnost:%d; ambicionnost:%d; nahodchivost:%d; vlast:%d", super.toString(),cunning, determination, ambition, ingenuity, thirsForPower);
    }
}
