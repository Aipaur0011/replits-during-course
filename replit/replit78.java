package Replits.replit;
/*
**For you to do:**

Create an int array of integers with a size of 5 and input values with Scanner.

Don't print prompt questions for a user.

Using loop print out each element of the array that should look like the output below

**Example:**

Input:

1
2
3
4
5
Output:
*10
* 20
* 30
* 40
* 50
 */

import java.util.Scanner;

public class replit78 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int [] num=new int[5];

        for(int i=0; i<num.length; i++) {
            num[i] = sc.nextInt();
        }
        for(int i : num) {
            System.out.println(i*10);
        }

    }
}
