package Replits.replit;

import java.util.Scanner;

/*
 Given the following inputs:
String s;
Write a for loop that will print out the reverse of the string.
Sample input/outputs:
In: manhattan
nattahnam
In: processor
rossecorp
In: racecar
racecar
 */
public class replit100 {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String s = inp.nextLine();
            //write your code below


            String revers="";

            for (int i = s.length()-1; i >=0 ; i--) {
                revers=revers+s.charAt(i);
            }
            System.out.println(revers);
    }
}
