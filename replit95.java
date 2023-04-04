package Replits;
/*
**For you to do:**
Using Scanner class input string value.
Print out the following: "The first 3 letters of \_\_\_ is ___"
For example, if the input is "banana", your output should be:
* "The first 3 letters of banana is ban".
 */

import java.util.Scanner;

public class replit95 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String input=sc.nextLine();
        String input1=input.substring(0,3);
        System.out.println("The first 3 letters of your word is "+input1);



    }


}
