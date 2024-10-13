class Parent{
    void show(){
        System.out.println("It shows Parent");
    }
}
class Child extends Parent{
    // Override
    void show(){
        System.out.println("It shows child sound");
    }
}


public class Main3 {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show();

        Parent obj2 = new Child();
        obj2.show();   
    }
}
