package Replits.replit3;
/*
**For you to do:**

Using do while loop print even numbers from 20 to 1

**Expected Output:**
20
18
16
14
12
10
8
6
4
2


 */

public class replit52 {
    public static void main(String[] args) {

        int a=20;
        do{
            if(a%2==0){
                System.out.println(a);
            }
            a--;
        }
        while(a>0);
    }
}
