package Replits.replit2;
/*
Declare static variable in class level as below and assign its value:

String ss="Welcome To Syntax Technologies"

Access variable in the main method and print it using three ways you learned so far

Hint:

first way: By calling directly

Second way: By using the className

Third way: By creating the object of the class

**Expected Output:**
Welcome To Syntax Technologies
Welcome To Syntax Technologies
Welcome To Syntax Technologies
 */

public class replit124 {



        static String ss="Welcome To Syntax Technologies";

        void var(){
            System.out.println(ss);
        }
        void var2(){
            System.out.println("Welcome To Syntax Technologies");
        }
        public static void main(String[] args) {

            replit124 main=new replit124();
            System.out.println(ss);
            System.out.println(replit124.ss);
            System.out.println(main.ss);


            main.var();
            main.var2();
        }
    }


