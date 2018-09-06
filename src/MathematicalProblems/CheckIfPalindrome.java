package MathematicalProblems;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        String palindrom = "aabaa";
        StringBuilder reversePalindrom = new StringBuilder();
        /**
         * In java Strings are immutable. So, unlike int array we can't reverse a string and save it into another string.
         * to solve this issue, we can use StringBuilder. Unlike String, we can set a char of StringBuilder.
         */

        int wordLength = palindrom.length();
        //length of string word. Since we are gonna frequently use this length, might as well hold it in a variable.

        for(int i=0;i<wordLength;i++){
            reversePalindrom.append(palindrom.charAt(wordLength-1-i));
            /**
             * StringBuilder.append adds to the StringBuilder object. similar to array list and linked list.
             * since we are reversing, we are gonne keep the ending values of word in the starting indexes of palindrom.
             * To visualize what is happening in this line, u can scatch the whole thing in a paper.
             */

        }
        //System.out.println(palindrom);  This is how we print StringBuilder obj. no need to use loops.

        String revPalindromString = new String(reversePalindrom);
        /**
         * converting StringBuilder to String. cause the 'matches' method of String class
         * will not work between String and StringBuilder.
         */


        if(palindrom.matches(revPalindromString)){
            //matches() checks if two Strings are a match. and will return true if they are a match.
            System.out.println("The words are palindrom.");
        }
        else System.out.println("The words are not palindrom.");
    }
}
