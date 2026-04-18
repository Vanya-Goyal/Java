package Ques1;
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}

class Patient extends Person{
    String disease;
    Patient(String name, int age, String disease){
        super(name, age);
        this.disease = disease;
    }
    void displayInfo(){
        System.out.println("Patient name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Disease: "+ disease);
    }
}
class Doctor extends Person{
    String specialization;
    Doctor(String name, int age, String specialization){
        super(name, age);
        this.specialization = specialization;
    }
    void displayInfo(){
        System.out.println("Doctor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
    }
}
public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient("Rahul", 25, "Flu");
        Doctor d1 = new Doctor("Dr. Mehta", 45, "Cardiologist");

        System.out.println("---- Patient Info ----");
        p1.displayInfo();

        System.out.println("\n---- Doctor Info ----");
        d1.displayInfo();
    }
}
