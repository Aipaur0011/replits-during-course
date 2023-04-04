package Replits.replit1;
/*
**For you to do:**
Inputs:
String word;
Write a for loop that will loop through every character of a word and print out each character, each on a separate line

 Sample inputs/outputs:
In: hello
h
e
l
l
o

In: zimbabwe
z
i
m
b
a
b
w
e

In: wow!
w
o
w
!

 */

import java.util.Scanner;

public class replit102 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("In:");
        String word= sc.nextLine();


        for(int i=0; i<word.length();i++){
            System.out.println(word.charAt(i));
        }

    }
}
