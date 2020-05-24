package ru.geekbrains;

import java.util.Random;

public abstract class Animal {

        private String breed;
        private String name;
        private String color;
        private int age;

        private float maximumRunLengthMultiplicator;
        private float maximumSwimDistanceMultiplicator;
        private float maximumJumpHeightMultiplicator;

        public void setTheRangeOfValues(){
            Random rand = new Random();
            if (this.maximumRunLengthMultiplicator==0){
                this.maximumRunLengthMultiplicator=0.5f+rand.nextFloat();
            }
            if (this.maximumSwimDistanceMultiplicator==0){
                this.maximumSwimDistanceMultiplicator=0.5f+rand.nextFloat();
            }
            if (this.maximumJumpHeightMultiplicator==0){
                this.maximumJumpHeightMultiplicator=0.5f+rand.nextFloat();
            }
        }

        //CONSTRUCTORS

        public Animal(String breed, String name, String color, int age) {
            setTheRangeOfValues();
            this.breed = breed;
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public Animal() {
            setTheRangeOfValues();
        }

        // SETTERS

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setMaximumRunLengthMultiplicator(float maximumRunLengthMultiplicator) {
            this.maximumRunLengthMultiplicator = maximumRunLengthMultiplicator;
        }

        public void setMaximumSwimDistanceMultiplicator(float maximumSwimDistanceMultiplicator) {
            this.maximumSwimDistanceMultiplicator = maximumSwimDistanceMultiplicator;
        }

        public void setMaximumJumpHeightMultiplicator(float maximumJumpHeightMultiplicator) {
            this.maximumJumpHeightMultiplicator = maximumJumpHeightMultiplicator;
        }

        // GETTERS

        public String getBreed() {
            return breed;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public int getAge() {
            return age;
        }

        public float getMaximumRunLengthMultiplicator() {
            return maximumRunLengthMultiplicator;
        }

        public float getMaximumSwimDistanceMultiplicator() {
            return maximumSwimDistanceMultiplicator;
        }

        public float getMaximumJumpHeightMultiplicator() {
            return maximumJumpHeightMultiplicator;
        }

        //METHODS

        public abstract boolean run(int length);
        public abstract boolean swim(int distance);
        public abstract boolean jump(float height);
        public abstract void getInfoAboutMaximumValuesOfRunSwimJump();
}
