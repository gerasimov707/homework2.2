package compass;

public abstract class HogwartsStudent {
    private String name;
    private int magic;
    private int trasgression;

    public HogwartsStudent(String name, int magic, int trasgression) {
        this.name = name;
        this.magic = magic;
        this.trasgression = trasgression;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMagic() {
        return magic;
    }
    public void setMagic(int magic) {
        this.magic = magic;
    }
    public int getTrasgression() {
        return trasgression;
    }
    public void setTrasgression(int trasgression) {
        this.trasgression = trasgression;
    }
    public void compareHogwarts(HogwartsStudent hogwartsStudent){
        int ability1 = abilityHogwarts();
        int ability2= hogwartsStudent.abilityHogwarts();
        if (ability1 > ability2) {
            System.out.printf("student %s lyche stydenta %s%n", getName(), hogwartsStudent.getName());
        }else if (ability2>ability1) {
            System.out.printf("student %s lyche stydenta %s%n", hogwartsStudent.getName(), getName());
        }else {
            System.out.printf("student %s takoi ze, kak %s%n", hogwartsStudent.getName(), getName());
        }
    }
    public int abilityHogwarts(){
        return magic+trasgression;
    }
    public  void print(){
        System.out.println(this);
    }
    //public void compareTo(HogwartsStudent hogwartsStudent){
    @Override
    public String toString() {
        return String.format("student %s; sila magii: %d; sila transges:%d", name, magic,trasgression);

    }
}


