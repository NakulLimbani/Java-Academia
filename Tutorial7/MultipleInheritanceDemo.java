// Interface for the first parent class
interface Parent1 {
    void method1();
}

// Interface for the second parent class
interface Parent2 {
    void method2();
}

// Child class implementing both Parent1 and Parent2 interfaces
class Child implements Parent1, Parent2 {
    @Override
    public void method1() {
        System.out.println("Child implements method1 from Parent1");
    }

    @Override
    public void method2() {
        System.out.println("Child implements method2 from Parent2");
    }

    void childMethod() {
        System.out.println("Child-specific method");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();

        // Calling methods from both parent interfaces
        child.method1();
        child.method2();

        // Calling the child-specific method
        child.childMethod();
    }
}
