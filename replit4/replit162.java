package Replits.replit4;
/*
Overload static method and then execute both overloaded methods.

**Expected Output:**
static method without parameter
static method with int parameter
 */

public class replit162 {

    static void newMethod(){
        System.out.println("static method without parameter");

    }
    static void newMethod(int num){
        System.out.println("static method with int parameter");

    }

    public static void main(String[] args) {
        replit162 replit162=new replit162();
        newMethod();
        newMethod(1);

    }


}
