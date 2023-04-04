package Replits.replit2;
/*
For you to do:

Declare 3 instance variables to hold:

- name of the country
- capital
- population size

Create a method to display values of instance variables

Create 2 Object, assign values to instance variables, execute method display;

**Expected Output:**

```
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
```
 */

public class replit122 {

    String nameOfCounty="USA";
    String capital="Washington DC";
    int populationSize=330000000;


    String nameOfCounty1="Kazakhstan";
    String capital1="Astana";
    int populationSize1=18500000;

    void first(){
        System.out.println("The capital of "+ nameOfCounty+ " is " +capital+ " and population is "+ populationSize);

    }

    void second(){
        System.out.println("The capital of "+nameOfCounty1+" is "+capital1+ " and population is "+populationSize1);
    }

    public static void main(String[] args) {

        replit122 main=new replit122();

        main.first();
        main.second();
    }
}
