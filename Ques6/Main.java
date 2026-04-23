package Ques6;

class Animal{
    void eat(){
        System.out.println("eating..");
    }
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("eating bread");
    }
    void bark(){
        System.out.println("barking");
    }
}

class Demo{
    void dosomething(Animal a){
        a.eat();
        if(a instanceof Dog){
            Dog d = (Dog) a;
            d.bark();
        }
    }
}

public class Main {
    public static void main(String[] args){
        Demo d1 = new Demo();
        d1.dosomething(new Animal());// false
        d1.dosomething(new Dog()); // true
    }
}
