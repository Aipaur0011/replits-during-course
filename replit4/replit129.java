package Replits.replit4;
/*
**For you to do:**
Declare two static variables to hold
- country name
- continent
Create a method to display the value of static variables in the following format:
____ located on \_\_\_\_ continent
In the main method assign values to a static variable and execute method display
**Expected Output:**
Morocco located on Africa continent
 */

public class replit129 {

    static String countryName;
    static String continent;

    void display(String countryName, String continent){
        System.out.println(countryName+" located on "+continent+" continent");
    }

    public static void main(String[] args) {
        replit129 replit=new replit129();
        replit.display("Morocco", "Africa");
    }
}
