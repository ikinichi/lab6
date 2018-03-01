package task3;

public class Human extends Ape {
    private String name;
    private boolean depression = false;
    public Human(String name, int age, int height, int weight, int limbs) {
        super(age, height, weight, limbs);
        this.name = name;
    }

    public void goToWork(){
        int nervousness = 0;
        while(!this.depression){
            nervousness++;
            if (nervousness>=100)
                this.depression = true;
        }
    }

    public void rest(){
        int relaxation =0;
        while (this.depression){
            relaxation++;
            if(relaxation==30)
                this.depression = false;
            if(relaxation>30)
                relaxation=0;
        }
    }

    public boolean isDepression() {
        return depression;
    }
}
