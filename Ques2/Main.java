package Ques2;
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Patient extends Person{
    String disease;
    Patient(String name, int age, String disease){
        super(name, age);
        this.disease = disease;
        
    }
    void display(){
        super.display();
        System.out.println("Disease: "+ disease);
    }
}

public class Main {
    public static void main(String[] args) {
        Patient p = new Patient("Nobody", 25, "Null");
        System.out.println("\n--- Display Info ---");
        p.display();
    }
}
