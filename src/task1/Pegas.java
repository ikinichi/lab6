package task1;

public class Pegas extends Horse {

    public Pegas(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(super.getName()+" летит");
    }
}

