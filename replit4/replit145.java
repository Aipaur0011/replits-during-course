package Replits.replit4;
/*
1. Complete the Dog.java class:

Create following class variables.
dogName
dogWeight
static dogBreed=Mutt;
For all methods and variables use proper naming convention.
Create constructor to initialize instance variables

2. In Main class Create 2 Objects of a Dog class and using each object reference variable print details of objects.
**Expected Output:**

Tarzan Mutt 50.0
Lucy Mutt 10.0
 */

public class replit145 {
    String dogName;
    double godWeight;
    static String  dogBreed="Mutt";

    public replit145(String dogName, double godWeight) {
        this.dogName = dogName;
        this.godWeight = godWeight;
    }

    void Display(){
        System.out.println(dogName+" "+dogBreed+" "+godWeight);

    }

    public static void main(String[] args) {
        replit145 dog=new replit145("Tarzan",50.0);
        replit145 dog2=new replit145("Lucy",10.0);
        dog.Display();
        dog2.Display();


    }
}
