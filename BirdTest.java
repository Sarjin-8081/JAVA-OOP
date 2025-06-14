abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle is flying high.");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("Penguins cannot fly.");
    }
}

public class BirdTest {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.fly();
        penguin.fly();
    }
}
