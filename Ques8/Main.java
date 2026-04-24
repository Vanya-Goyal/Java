package Ques8;



class A{
    static void show(){
        System.out.println("Class A method");
    }
}

class B extends A{
    static void show(){
        System.out.println("Class B method");
    }
}

public class Main {
    public static void main(String[] args){
        
        A.show();
    }
}

