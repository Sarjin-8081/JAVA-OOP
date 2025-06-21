// Class: Character
class Character {
    void attack() {
        System.out.println("Character attacks!");
    }
}

// Class: Warrior
class Warrior extends Character {
    @Override
    void attack() {
        System.out.println("Warrior swings a sword!");
    }
}

// Class: Mage
class Mage extends Character {
    @Override
    void attack() {
        System.out.println("Mage casts a fireball!");
    }
}

// Class: GameDemo
public class GameDemo {
    public static void main(String[] args) {
        Character c1 = new Character();
        Character c2 = new Warrior();
        Character c3 = new Mage();

        c1.attack();
        c2.attack();
        c3.attack();
    }
}
