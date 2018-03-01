package task3;

public class Fish {
    private boolean alive;
    private int age;
    public Fish(int age){
        alive = true;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean des){
        this.alive = des;
    }

    public void makeOlder(){
        this.age++;
    }

}
