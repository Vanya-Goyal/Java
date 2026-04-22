package Ques3;

class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args){
        Animal a = new Dog();
        a.makeSound();
    }
}
