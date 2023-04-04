package Replits.replit1;
/*
Create a method with the following specs:

Returns:
an integer

Name:
sumEvenToX

Parameters:
an integer called "x"

Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)

Examples:
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20
 */

public class replit117 {

    int numEvenRoX(int x){
        int sum=0;
        for(int i=0;i<=x;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        replit117 main=new replit117();

        System.out.println(main.numEvenRoX(5));
    }

    }

