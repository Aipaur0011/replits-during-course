package Replits.replit4;
/*
For you to do:
In AnotherClass declare a private, default, protected, public methods and have them
each return the name of the what access modifier they are using.
All methods should be accessible by class name
Call methods of Another class inside Main class
**Expected Output:**
default
protected
public
 */


public class Replit138 {

    public static void main(String[] args) {

        AnotherClass work=new AnotherClass();
        work.display();
        work.displayTwo();
        work.displayThree();
    }
}

class AnotherClass{

    void display(){
        System.out.println("default");
    }

    protected void displayTwo(){
        System.out.println("protected");
    }

    public void displayThree(){
        System.out.println("public");
    }
}
