package Replits;
/*
**For you to do:**

- Create a String given="I love Java classes at Syntax"
- Retrieve 2 Strings using substring method from given String and print them

**Expected Output:**
classes at Syntax
I love Java
 */

public class replit94 {
    public static void main(String[] args) {

        String given="I love Java classes at Syntax";

        String newString=given.substring(12);
        System.out.println(newString);

        String newString1=given.substring(0,11);
        System.out.println(newString1);

    }
}
