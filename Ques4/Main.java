package Ques4;

class Display{
        void show(int a){
            System.out.println("Integer: " + a);
        }
        void show(String s){
            System.out.println("String: " + s);
        }
        void show(int a, String s){
            System.out.println(a + " " + s);
        }
}

public class Main {
    public static void main(String[] args){
        Display d = new Display();
        d.show(10);
        d.show("Hello World");
        d.show(5, "Java");
    }
}