package ru.geekbrains;

public class Dog extends Animal {
    public Dog(String breed, String name, String color, int age) {
        super(breed, name, color, age);
    }

    public Dog(){
    }

    int nominalRun=500;
    int nominalSwim=10;
    float nominalJump=0.5f;

    @Override
    public boolean run(int length) {
        float x = nominalRun*getMaximumRunLengthMultiplicator();
        if (length>x){
            System.out.print(this.getName()+" ran "+x+" meters and ran out of steam. Next "+(length-x)+" later, when he rests. ");
        } else {
            System.out.print(this.getName() + " ran " + length + " meters. ");
        }
        return (length<=x);
    }

    @Override
    public boolean swim(int distance) {
        float x = nominalSwim*getMaximumSwimDistanceMultiplicator();
        if (distance>x){
            System.out.print(this.getName()+" swam "+x+" meters and got to land. "+distance+" is too much. ");
        } else {
            System.out.print(this.getName() + " swam " + distance + " meters. ");
        }
        return (distance<=x);
    }

    @Override
    public boolean jump(float height) {
        float x = nominalJump*getMaximumJumpHeightMultiplicator();
        if (height>x){
            System.out.print(this.getName()+" jumped only "+x+" meters and then gravitation wins. "+height+" meter height is too much. ");
        } else {
        System.out.print(this.getName()+" jumped "+height+" meters. ");
        }
        return (height<=x);
    }

    @Override
    public void getInfoAboutMaximumValuesOfRunSwimJump(){
        System.out.println("Characteristics of "+getName()+":");
        System.out.println(getName()+" - " +getColor() + " " + getBreed() + " dog. " + getAge() + " years old.");
        System.out.println("Maximum Run is: " + nominalRun*getMaximumRunLengthMultiplicator() + " from nominal " + nominalRun );
        System.out.println("Maximum Swim is "+ nominalSwim*getMaximumSwimDistanceMultiplicator()+" from nominal "+nominalSwim);
        System.out.println("Maximum Jump is: " + nominalJump*getMaximumJumpHeightMultiplicator()+ " from nominal " + nominalJump +"\n");
    }



}
