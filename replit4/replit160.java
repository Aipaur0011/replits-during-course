package Replits.replit4;
/*
For you to do:
Overload instance method display by having different types of parameters
Inside each method write the logic to print value of the parameter
Call all methods inside your main method
**Expected Output:**
100
Syntax Technologies
100.09
 */

public class replit160 {

    public void display(int num){
        System.out.println(num);
    }
    public void display(String word){
        System.out.println(word);
    }

    public void display(double number){
        System.out.println(number);
    }

    public static void main(String[] args) {

        replit160 replit=new replit160();
        replit.display(100);
        replit.display("Syntax Technologies");
        replit.display(100.09);
    }
}
