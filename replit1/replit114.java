package Replits.replit1;
/*
**For you to do :**
Step1: Create three methods that will accept 2 in parameters on integer type
*
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
*
Step3: execute all methods
1. for the addition method add two numbers to make 30
2. for multiplication multiply two numbers to make 30
3. for Subtraction subtract two numbers to equal 20
*
**Expected Output:**
Addition 30
Multiplication 30
Subtraction 20
 */

public class replit114 {

    void abc1  (int num1, int num2){
        System.out.println("Addition "+(num1+num2));
    }

    void abc2 (int num1, int num2){
        System.out.println("Multiplication "+(num1*num2));
    }

    void abc3 (int num1, int num2){
        System.out.println("Subtraction "+(num1-num2));
    }

    public static void main(String[] args) {
        replit114 numbers=new replit114();
        numbers.abc1(15,15);
        numbers.abc2(3,10);
        numbers.abc3(60,40);

    }




}
