package Replits.replit;
/*
**For you to do:**

Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x}

Print the values so the output should look like below

**Output:**

syntax
 */

public class replit72 {
    public static void main(String[] args) {

        char [] letters={'s', 'a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
        for (int i = 0; i < letters.length ; i++) {
            if(i%2==0){
                System.out.print(letters[i]);
            }

        }
    }
}
