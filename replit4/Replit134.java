package Replits.replit4;
/*
Write a method with the following specs:
Returns:
an integer
Name:
countVowels
Parameters:
a String called s
Purpose:
count the number of vowels in the string s.  Assume s is all lowercase.
Examples:
countVowels("obama") ==> 3
countVowels("happy friday! i love weekends") ==> 9
 */

public class Replit134 {

    static int countVowels(String s){

        char letter;
        int count=0;

        for (int i = 0; i <s.length() ; i++) {
            letter=s.charAt(i);
            if(letter=='a'|| letter=='e'|| letter=='u'|| letter=='i'||letter=='y'||letter=='o'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){

        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }

}
