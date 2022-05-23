package compass;

public  class GriffindorStudent extends HogwartsStudent {
    private int nobility;
    private int bravery;
    private int honor;

    public GriffindorStudent(String name, int magic, int trasgression, int nobility, int bravery, int honor) {
        super(name, magic, trasgression);
        this.nobility = nobility;
        this.bravery = bravery;
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void compareGriffindor(GriffindorStudent griffindorStudent){
        int ability1 = ability();
        int ability2= griffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("student %s lyche stydenta %s%n", getName(), griffindorStudent.getName());
        }else if (ability2>ability1) {
            System.out.printf("student %s lyche stydenta %s%n", griffindorStudent.getName(), getName());
        }else {
            System.out.printf("student %s takoi ze, kak %s%n", griffindorStudent.getName(), getName());
        }
    }

    public int ability() {
        return nobility+honor+ bravery;
    }

    @Override
    public String toString() {
        return String.format("%s; blagorotstvo:%d; chest:%d; hrabrost:%d", super.toString(), nobility,honor,bravery);

    }
}


