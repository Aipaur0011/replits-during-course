package Replits.replit4;
/*
For you to do:
Create the maxValue method that will
accept int array and return return the maximum value in the array.
Method should visible every class in any package!

**Expected Output:**
22
 */

public class Replit141 {

    public static int maxValue(int[] array) {
        int num = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > num) {
                num = array[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(maxValue(arr)); //should print 22


    }


}
