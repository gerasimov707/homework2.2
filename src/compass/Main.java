package compass;

import java.util.Random;

public class Main {
public static final Random RANDOM = new Random();
    public static void main(String[] args) {
	GriffindorStudent harry = new GriffindorStudent("Harry Potter",generate(),generate(),generate(),generate(),generate());
    GriffindorStudent ron = new GriffindorStudent("Ron Vizli",generate(),generate(),generate(),generate(),generate());
    RavenclawStudent luna = new RavenclawStudent("Polyzna Lovry",generate(),generate(),generate(),generate(),generate(),generate());
    SlytherinStudent draco = new SlytherinStudent("Grafo Malfoi",generate(),generate(),generate(),generate(),generate(),generate(),generate());
    HufflepuffStudent sedric = new HufflepuffStudent("Sedric Diggori",generate(),generate(),generate(),generate(),generate());

    System.out.println(harry);
    System.out.println(ron);
    System.out.println(luna);
    System.out.println(draco);
    System.out.println(sedric);

    harry.compareHogwarts(draco);
    harry.compareGriffindor(ron);

    }
    private static int generate() {return RANDOM.nextInt(100);}
}
