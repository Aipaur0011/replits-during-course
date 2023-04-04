package Replits.replit1;
/*
Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false

( Return false if one or both given numbers are not even)
Examples:
- bothEven(4,6) ==> true
- bothEven(3,4) ==> false
- bothEven(-1,1) ==> false

**Expected Output:**
false
 */

public class replit116 {

    boolean num(int num1,int num2){
        boolean flag;
        if(num1%2==0&&num2%2==0){
            flag=true;
        }else{
            flag=false;
        }
        return flag;
    }
    public static void main(String[] args) {

        replit116 main=new replit116();
        System.out.println(main.num(25,20));
    }
}

