package task2;

public class Dog extends Pet {
    private String name;
    public Dog(int weight, int age, String male, String name) {
        super(weight, age, male);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void describe(){
        if(getMale().toLowerCase()=="female")
            System.out.println("Это сука");
        else
            System.out.println("Это кобель");

        System.out.println("Имя = " + getName());
        System.out.println("пол = " + getMale());
        System.out.println("вес = " + getWeight());
        System.out.println("возраст = " + getAge());
    }
}
