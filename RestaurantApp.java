public class RestaurantApp {
    public static void main(String[] args) {
        MenuItem appetizer = new Appetizer();
        MenuItem mainCourse = new MainCourse();
        MenuItem beverage = new Beverage();

        appetizer.prepare();
        mainCourse.prepare();
        beverage.prepare();
    }
}

abstract class MenuItem {
    abstract void prepare();
}

class Appetizer extends MenuItem {
    void prepare() {
        System.out.println("Preparing appetizer...");
    }
}

class MainCourse extends MenuItem {
    void prepare() {
        System.out.println("Preparing main course...");
    }
}

class Beverage extends MenuItem {
    void prepare() {
        System.out.println("Preparing beverage...");
    }
}
