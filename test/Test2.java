import task2.Cat;
import task2.Dog;

public class Test2 {

    public static void main(String[] args) {
        Dog dog = new Dog(32,2,"male","James");
        Cat cat = new Cat(4,7,"female","Katty");
        dog.describe();
        cat.describe();
    }
}
