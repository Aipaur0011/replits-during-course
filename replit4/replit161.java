package Replits.replit4;
/*
Overload private instance method m1
Call each method from the main method.

Expected Output:
private m1 method
private m1 method with int parameter
 */

public class replit161 {
    private void m1() {
        System.out.println("private m1 method");
    }

    private void m1(int num) {
        System.out.println("private m1 method with int parameter");
    }

    public static void main(String[] args) {
        replit161 example = new replit161();
        example.m1();
        example.m1(1);
    }
}
