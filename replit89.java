package Replits;
/*For you to do:**
 - Create a String "name" and assign the value "Timmy" to it.
 - Find out how many characters are there in the given String.*/





public class replit89 {
    public static void main(String[] args) {

        String name="Timmy";

        int counter=0;
        for(int i =0;i<name.length();i++){
            if(Character.isAlphabetic(name.charAt(i)));
            counter++;
        }
        System.out.println(counter);
    }
}

