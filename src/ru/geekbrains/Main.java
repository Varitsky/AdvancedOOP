package ru.geekbrains;

public class Main {

    public static void main(String[] args) {

	// (String breed, String name, String color, int age)
    // (int run, int swim, float jump)

        Cat cat = new Cat("Persian", "Pushistik", "White", 10);
        System.out.println("Run: "+cat.run(20));
        System.out.println("Swim: "+cat.swim(2));
        System.out.println("Jump: "+cat.jump(0.5f)+"\n");

        cat.getInfoAboutMaximumValuesOfRunSwimJump();

        Dog dog = new Dog("Shitzu", "Ruby", "Black Gold", 1);
        System.out.println("Run: "+dog.run(200));
        System.out.println("Swim: "+dog.swim(5));
        System.out.println("Jump: "+dog.jump(0.4f)+"\n");

        dog.getInfoAboutMaximumValuesOfRunSwimJump();

        Cat anotherCat = new Cat();
        anotherCat.setBreed("Oriental");
        anotherCat.setName("Grace");
        anotherCat.setColor("Bblack");
        anotherCat.setAge(7);
        System.out.println("Run: "+anotherCat.run(220));
        System.out.println("Swim: "+anotherCat.swim(2));
        System.out.println("Jump: "+anotherCat.jump(2.5f)+"\n");

        anotherCat.getInfoAboutMaximumValuesOfRunSwimJump();

        Dog anotherDog = new Dog();
        anotherDog.setBreed("Labrador Retriever");
        anotherDog.setName("Ryan");
        anotherDog.setColor("White");
        anotherDog.setAge(1);
        System.out.println("Run: "+anotherDog.run(700));
        System.out.println("Swim: "+anotherDog.swim(17));
        System.out.println("Jump: "+anotherDog.jump(1f)+"\n");

        anotherDog.getInfoAboutMaximumValuesOfRunSwimJump();

    }
}
