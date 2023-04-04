package Replits.replit4;
/*
For you to do
In main class please declared the variables using different
access modifiers that will hold value for:
- name
- city
- name of the school
- batch number
Create a method to display details in following format:
My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
Assign values to the variables and execute method display
**Expected Output:**
My name is John and I live in Miami. I study at Syntax in batch 9
 */

public class Replit137 {

    private String name;
    String city;
    protected String nameOfTheScholl;
    public int batchNum;
    void print() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + nameOfTheScholl + " in batch " + batchNum);
    }


    public static void main(String[] args) {
        Replit137 replit=new Replit137();
        replit.name="John";
        replit.city="Miami";
        replit.nameOfTheScholl="Syntax";
        replit.batchNum=9;
        replit.print();

    }
}
