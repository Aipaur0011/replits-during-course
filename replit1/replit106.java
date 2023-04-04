package Replits.replit1;
/*
# For you to do
Instantiate and StringBuffer class
Append Value "Hello" to it
Append value "World" to it.
Print in UPPERCASE.
**Expected Output:**
HELLO WORLD
 */

import java.util.Locale;

public class replit106 {
    public static void main(String[] args) {

        StringBuilder str=new StringBuilder("Hello");
        str.append("World");
        System.out.println(str.toString().toUpperCase());


    }
}
