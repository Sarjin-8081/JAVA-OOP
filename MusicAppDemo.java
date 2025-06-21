// Class: Instrument
class Instrument {
    void playSound() {
        System.out.println("Playing instrument sound");
    }
}

// Class: Piano
class Piano extends Instrument {
    @Override
    void playSound() {
        System.out.println("Piano is playing a melody");
    }
}

// Class: Guitar
class Guitar extends Instrument {
    @Override
    void playSound() {
        System.out.println("Guitar is strumming chords");
    }
}

// Class: Violin
class Violin extends Instrument {
    @Override
    void playSound() {
        System.out.println("Violin is playing a tune");
    }
}

// Class: MusicAppDemo
public class MusicAppDemo {
    public static void main(String[] args) {
        Instrument[] instruments = {new Piano(), new Guitar(), new Violin()};
        
        for (Instrument instrument : instruments) {
            instrument.playSound();
        }
    }
}
