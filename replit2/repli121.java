package Replits.replit2;
/*
For you to do:

declare 3 instance variables to hold an integer, double and char values.

Create 2 instances of the class and assign values to variables and the print them

**Expected Output:**

```
10
10.23
a
100
100.23
s
```
 */
public class repli121 {
    int a=10;
    double b=10.23;
    char c='a';

    int a1=100;
    double b1=100.23;
    char c1='s';

    void as(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    void ad(){
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
    }

    public static void main(String[] args) {

        repli121 main=new repli121();
        main.as();
        main.ad();

    }
}
