package task2;

public abstract class Pet {
    private int weight;
    private int age;
    private String male;
    Pet(int weight,int age, String male){
        this.weight = weight;
        this.male = male;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getMale() {
        return male;
    }

    public void makeOlder() {
        this.age++;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
