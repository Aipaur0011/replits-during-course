package Replits.replit1;
/*
# How would you reverse a String using StringBuffer Class
Given String = "Hello Friends"
**Expected Output:**
sdneirF olleH
 */

public class replit107 {
    public static void main(String[] args) {

        StringBuilder str=new StringBuilder("Hello Friends");
        str.reverse();

        System.out.println(str);
    }
}
