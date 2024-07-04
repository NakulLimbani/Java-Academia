class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class MultipleInheritanceExample implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}

class Grandparent {
    void display1() {
        System.out.println("Grandparent class");
    }
}

class Parent extends Grandparent {
    void display2() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display3() {
        System.out.println("Child class");
    }

}

public class InheritanceExample {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multiple Inheritance through Interfaces
        MultipleInheritanceExample obj = new MultipleInheritanceExample();
        obj.methodA();
        obj.methodB();

        // Multilevel Inheritance
        Child child = new Child();
        child.display1();
        child.display2();
        child.display3();

        // Hierarchical Inheritance
        Parent parent = new Parent();
        Child child2 = new Child();
        parent.display1();
        parent.display2();
        child2.display1();
        child2.display3();
    }
}

