package task3;

public abstract class Animal extends Fish {
    private int limbs;
    Animal(int age,int limbs) {
        super(age);
        this.limbs = limbs;
    }

    public boolean canMove(){
        if(this.limbs>=1)
            return true;
        return false;
    }

    public int getLimbs() {
        return limbs;
    }

    public void cripple(int howManyLimbsItLosed){
        if (howManyLimbsItLosed>this.limbs) {
            System.out.println("У бедного существа отняли конечностей больше чем у него было! Будем считать, что теперь он лешился их всех");
            this.limbs=0;
        }
        this.limbs -=howManyLimbsItLosed;

    }
}
