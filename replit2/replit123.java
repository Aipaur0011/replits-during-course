package Replits.replit2;
/*
For you to do:

Declare the **instance** variables to hold:

- integer values
- String values
- double values
- boolean values
- float values

Access instance variables and then print them all without assigning any values to them.

Print variables one by one the same sequence that you declare them.

**Expected Output:**

0
null
0.0
false
0.0
 */
public class replit123 {

    int values;
    String values1;
    double values2;
    boolean values3;
    float values4;

    public static void main(String[] args) {

        replit123 repl=new replit123();
        repl.values=0;
        repl.values1=null;
        repl.values2=0.0;
        repl.values3=false;
        repl.values4=0.0f;

        System.out.println(repl.values);
        System.out.println(repl.values1);
        System.out.println(repl.values2);
        System.out.println(repl.values3);
        System.out.println(repl.values4);
    }

}
