package Replits.replit4;
/*
In Parent Class create a method with name method() that will print  "Parent method"
Override method() in Child class that will print "Child method"
In Main Class create objects of child and parent class and call its method.

**Expected Output:**
Parent method
Child method
 */

public class replit163 {

    public void method(){
        System.out.println("Parent method");
    }
}

 class child extends replit163{

    public void method(){
        System.out.println("Child method");
    }

     public static void main(String[] args) {

        replit163 replit163=new replit163();
        replit163 child=new child();
        replit163.method();
        child.method();
     }
 }

