package MathematicalProblems;

import java.util.Arrays;

public class CheckIfAnagram {
    public static void main(String[] args) {
        String s1 = "ARMY";
        String s2 = "MARY";
        int[] s1Ascii = new int[s1.length()]; //String is an array of characters and every character has an aski code.
        //s1Ascii is an array of type int that will store aski codes of the characters of string s1.
        int[] s2Ascii = new int[s2.length()];
        //s2Ascii is an array of type int that will store aski codes of the characters of string s2.

        if(s1.length()!=s2.length()) System.out.println("Not anagram."); //if lengths of two strings don't match, then being 
        // anagram i out of question!
        else {
            for(int i=0; i<s1.length();i++){
                s1Ascii[i]= (int) s1.charAt(i);
                s2Ascii[i]=(int) s2.charAt(i);
                //storing each character's aski code in arrays.
            }

            Arrays.sort(s1Ascii);
            Arrays.sort(s2Ascii);
            //using java.util.Arrays class method sort to sort the arrays.

            if(Arrays.equals(s1Ascii,s2Ascii)) System.out.println("Anagram");
            //equals method compares two arrays and returns true if both array is the same.
            //After sorting, two strings that are anagram will have absolute duplicate arrays. If not then
            //they are not anagram.
            else System.out.println("Not anagram");

        }
    }
}
