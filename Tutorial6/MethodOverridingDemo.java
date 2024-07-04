class Animal {
    void makeSound() {
        System.out.println("The animal makes a generic sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        genericAnimal.makeSound(); // Calls the makeSound method in the Animal class
        dog.makeSound(); // Calls the overridden makeSound method in the Dog class
        cat.makeSound(); // Calls the overridden makeSound method in the Cat class
    }
}
