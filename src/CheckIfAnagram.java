import java.util.Arrays;

public class CheckIfAnagram {
    public static void main(String[] args) {
        String s1 = "ARMY";
        String s2 = "MARY";
        int[] s1Ascii = new int[s1.length()];
        int[] s2Ascii = new int[s2.length()];

        if(s1.length()!=s2.length()) System.out.println("Not anagram.");
        else {
            for(int i=0; i<s1.length();i++){
                s1Ascii[i]= (int) s1.charAt(i);
                s2Ascii[i]=(int) s2.charAt(i);
            }

            Arrays.sort(s1Ascii);
            Arrays.sort(s2Ascii);

            if(Arrays.equals(s1Ascii,s2Ascii)) System.out.println("Anagram");
            else System.out.println("Not anagram");

        }
    }
}
