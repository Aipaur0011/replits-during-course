package Replits.replit;
/*
**For you to do:**

Create an array of integers that will store 5 elements taken from a user

Don't print any prompt message for the user

Then print out all the elements you have created in the first loop in reverse order.

**Example:**

```
Input:
* 1
* 2
* 3
* 4
* 5
Output:
5
* 4
* 3
* 2
* 1
*

 */

import java.util.Scanner;

public class array77 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int []num=new int[5];
        num[0]=sc.nextInt();
        num[1]=sc.nextInt();
        num[2]=sc.nextInt();
        num[3]=sc.nextInt();
        num[4]=sc.nextInt();

        for(int i=num.length-1; i>=0; i--){

            System.out.println(num[i]);

            }
        System.out.println();
        }


    }

