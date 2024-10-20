
import java.util.ArrayList;

public class Main {


    static int countletters(String yourString,  char tempChar){
        yourString = yourString.toLowerCase();

        int counter = 0;
        for(int i=0; i<yourString.length();i++){
            if(tempChar == yourString.charAt(i)){
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        String NabiHubby = "NarmMiiie", tempString = "";

        int i = 0, highestVal = 0 , counter =0 ;
        char highestChar = 0;
        tempString = NabiHubby.toLowerCase();
        for(i = 0; i<tempString.length(); i++){
            counter = countletters(NabiHubby, tempString.charAt(i));
            if(counter > highestVal){
                highestVal = counter;
                highestChar = NabiHubby.charAt(i);
            }
        }
        if(highestVal ==1){
            System.out.println("All Characters are unique. ");
        }else{
            System.out.println("First letter found to be the highest appearance: " + highestChar + " with " + highestVal + " repeating letters");
        }


    }
}

//2 types of fata types
//primitive data types - built in in java
//non primitive data types - the programmer can modify



