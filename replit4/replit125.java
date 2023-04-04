package Replits.replit4;
/*
**For you to do:**
Declare a static variable **number** that will hold an integer value:
Access **number** from the main method and assign value to it.
Create an Object of the class, access **number** in a nonstatic way and assing value of 200.
Print out **number** using class name and using instance
**Expected Output:**
200
200
 */

public class replit125 {

    static int number;
    void printOne(int num){
        System.out.println(num);
    }

    void printTwo(int number){
        System.out.println(number);
    }

    public static void main(String[] args) {

        replit125 replit=new replit125();
        replit.printOne(200);
        replit.printTwo(200);

    }

}
