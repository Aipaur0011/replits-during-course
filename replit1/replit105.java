package Replits.replit1;

import java.util.Scanner;

/*
**For you to do:**
There is a code that takes input as a String.
Write a program that will print out only vowels of that string
Sample input/outputs:
In: howdyho
oo
In: huehuehuehue
ueueueue
In: poopoo what idk what im doing
ooooaiaioi
```
 */
public class replit105 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        String word1 =word.replaceAll("[^aeiou]","");

        System.out.println(word1) ;
    }

}


