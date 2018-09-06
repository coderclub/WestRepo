package MathematicalProblems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CheckIfDuplicate {

        public static void main(String[] args) {
            String test = "This sentence contains one or two words , one or two words";
            Set<String> duplicates = duplicateWords(test);
            System.out.println("input : " + test);
            System.out.println("output : " + duplicates);
        }


        /*
         * Method to find duplicate words in a Sentence or String
         * @param input String
         * @return 'duplicates' which is a Hashset.
         * We are using HashSet to find duplicates cause HashSets don't allow duplicate values. So, if we add HashSet elements
         * inside if statement, when it finds a duplicate it will return false.
         */

        public static Set<String> duplicateWords(String input){

            if(input == null || input.isEmpty()){
                return Collections.emptySet();
                /**
                 * Don't know much about collection frameworks, but from what i guess, Collections.emptySet() will
                 * return an empty set from this method as the given string might be empty.
                 */
            }
            Set<String> duplicates = new HashSet<>();
            /**creating HashSet named duplicates. This will store the duplicate words found.
             * Reason behind this being of type HashSet is that there might be more than two occurances of a word.
             * And we want to show just the words that are duplicate. In that case, if duplicates is a HashSet, it will take a
             * duplicate word only once; eliminating all options of multiple prints of a same word.
             */


            String[] words = input.split(" ");
            /**
             * words is the String array that will split array 'input' whenever it finds " " meaning a
             * white space. For details u can see split method of String class.
             */

            Set<String> set = new HashSet<>();
            //set is the HashSet where we will add all the split words from string 'input'

            for(String word : words){
                if(!set.add(word)){
                    /**
                     * As we know hash set don't except duplicate values when inserting.
                     * So, if there is a duplicate word found, then set.add(word) statement will
                     * return false. Inversing that, we get true and duplicate hashSet is assigned that value
                     * from String word.
                     */
                    duplicates.add(word); //when duplicate is found, it is inserted in duplicates hash set.
                }
            }


            return duplicates;
        }
}


