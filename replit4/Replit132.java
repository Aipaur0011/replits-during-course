package Replits.replit4;
/*
**For you to do:**
Complete the reduce10 method by making it subtract 10 from every element of the double array nums.
The method should static and it should return a new 2D array object
Print values from new array in the format below
input
1 2 3 4
4 5 6 7
1 3 5 7
**Expected Output:**
-9 -8 -7 -6
-6 -5 -4 -3
-9 -7 -5 -3
 */

import java.util.Arrays;

public class Replit132 {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };

        //create method reduce10 here

        a = reduce10(a);
    }

    //create method reduce10 here
    static int [][] reduce10(int [][] arr){
        for (int [] i:arr){
            for (int j:i){
                System.out.print((j-10)+ " ");
            }
            System.out.println();
        }
        return arr;
    }
    //test case below (dont change):
    public static int countA(String s) {
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                countA++;
            }
        }
        return countA;
    }
}

