package Replits.replit1;
/*
Write a method header with the following specs:

Returns:

a String
Name:

censorLetter

Parameters:

a String

a char

Then complete the method by programming the following behavior

Replace all instances of given character with a "*" within the given String.
See below examples.

Examples:

censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"

 */

public class replit119 {

    String censorLetter(String str, char a){
       String newStr= str.replace(a,'*');
       return newStr;

    }

    public static void main(String[] args) {
        replit119 main=new replit119();

        System.out.println(main.censorLetter("computer science",'e'));
        System.out.println(main.censorLetter("trick or treat",'t'));
    }
}
