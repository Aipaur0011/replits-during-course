package Replits.replit4;
/*
Write a method header on line two with the following specs:

Returns:
a String
Name:
thirdLetter
Parameters:
a String called s
Then complete the method by programming the following behavior
Returns every 3rd letter of the String s,
starting from the first letter.
See below examples.
Examples:
thirdLetter("hello there") ==> "hltr"
thirdLetter("technology") ==> "thly"
 */
public class Replit131 {

    static String name;

     static String thirdLetter(String s){
         String str="";

       for (int i = 0; i < s.length(); i++) {
           if (i % 3 == 0){
             str += (s.charAt(i));
           }
   }
         return str;
     }

    //test case below (don't change):
        public static void main(String[] args) {
        System.out.print(thirdLetter("hello there")); //"hltr"
            System.out.println();
        System.out.print(thirdLetter("technology")); //"thly"
    }
    }
