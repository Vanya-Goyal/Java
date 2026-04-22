package Ques5;

class Animal{

}
class Dog extends Animal{

}

public class Main {
    public static void main(String[] args){
        Dog d = new Dog();

        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);

        Animal a = new Dog();
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Animal);
       
        Animal b = new Animal();
        System.out.println(b instanceof Dog);
        System.out.println(b instanceof Animal);
        
    }
}
