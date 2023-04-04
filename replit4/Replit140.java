package Replits.replit4;
/*
For you to do:

Create the maxLength method that will accept
String array of words and return the word with the largest length.
Method should visible only within same package!
**Expected Output:**
this is long
 */

public class Replit140 {

    static String maxLenght(String [] strs){

        String longest="";

        for (String str:strs) {
            if(str.length()>longest.length()) {

                longest = str;
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        String[] arr={"hello","girl","boy","This is long"};

        System.out.println(maxLenght(arr));
    }
}
