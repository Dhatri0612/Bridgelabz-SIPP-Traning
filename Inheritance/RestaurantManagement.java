// Superclass: Person
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties();
}

// Subclass: Chef inherits Person and implements Worker
class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef is cooking delicious meals.");
    }
}

// Subclass: Waiter inherits Person and implements Worker
class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter is serving food to customers.");
    }
}

// Main Class
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Raj", 101);
        Waiter waiter = new Waiter("Amit", 102);

        chef.displayBasicInfo();
        chef.performDuties();
        System.out.println();

        waiter.displayBasicInfo();
        waiter.performDuties();
    }
}
