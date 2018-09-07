import java.util.ArrayList;
import java.util.Arrays;

/**
 * This code uses an arraylist of string and prints th first letter of each word.
 */

public class FindFirstCharOfWordOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hello Goodbye World"));
        //Initializing ArrayList
        StringBuilder sb = new StringBuilder();
        //Declaring string builder.
        String s1 = String.valueOf(list);
        //copying value of list to string s1.
        String[] stArr = s1.split(" ");
        // s1.split(" ") method splits s1 wherever it finds a white space. then stores those words in an array of string type.
        sb.append(stArr[0].charAt(1));
        //if done inside for loop, the first char of first element comes out '[' so I have taken the second char of the first element.
        for(int i=1;i<stArr.length;i++){
            sb.append(stArr[i].charAt(0));
            //takes first char of each element and appands the string builder.
        }
        String ret = new String(sb);
        //converting the stringbuilder into string. this is not a necessary step. we can also print the stringbuilder directly.
        System.out.println(ret);
    }
}
