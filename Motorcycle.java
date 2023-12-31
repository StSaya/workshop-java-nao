public class Motorcycle extends Vehicle {
    

    public Motorcycle (String b, String m, int y, int wght, int whls) {
        super(b, m, y);
        weight = wght;
        wheels = whls;
    }

    public void describe() {
        super.describe();
        System.out.println("I'm a Motocycle, I weight " + weight + " and I have " + wheels + " wheels.");
    }

    public void accelerate(String onomatopeia) {
        System.out.println("My " + brand + " goes like this : " + onomatopeia);
    }
}
