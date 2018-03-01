package task3;

public class Ape extends Animal {
    private int weight,height;
    public Ape(int age, int height, int weight, int limbs) {
        super(age, limbs);
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        if (weight<0)
            super.setAlive(false);
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
