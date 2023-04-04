package Replits.replit4;
/*
**1. Complete the SyntaxTechnologies class:**

Include the following class variables:

* schoolName(String)
* batch(int)
* year(int)
* lastDayOfClass(String)

Write two constructors:
* non-argument constructor
* parameterized constructor
Create method to display values of instance variables.

**2. In Main Class:**
Create two different objects of the SyntaxTechnologies class using both constructors and call display method.

**Expected Output:**
null 0 0 null
Syntax 6 2020 07/30/2020
```
 */

public class Replit142 {

    String schoolName;
    int batch;
    int year;
    String lastDay;

    //write non-argument constructors

    public Replit142() {
    }
    Replit142(String schoolName, int batch, int year,String lastDay) {
        schoolName = schoolName;
        batch = batch;
        year = year;
        lastDay = lastDay;

        this.schoolName = schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDay=lastDay;
    }


    public static void main(String[] args) {
        SyntaxTech142repl syntaxTech142repl=new SyntaxTech142repl();

        SyntaxTech142repl syntax=new SyntaxTech142repl("Syntax", 6, 2020,"07/30/2020");
        System.out.print(syntax.schoolName+" ");

        System.out.print( syntax.batch+" ");

        System.out.print(syntax.year+" ");

        System.out.print(syntax.lastDay+" ");

    }

}
