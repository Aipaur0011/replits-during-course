package Replits;
/*
**For you to do:**

Write a program that prints the highest value in the array.

**Expected Output:**
input [5,4,8]

```
8
```
 */
public class replit81 {
    public static void main(String[] args) {

        int[] num = {5, 4, 8};
        for (int i = 0; i < num.length; i++) {
            if (num[0] < num[i]) {
                System.out.println(num[i]);
            }

        }
    }
}
