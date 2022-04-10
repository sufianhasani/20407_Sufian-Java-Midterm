package string_problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program, `isAnagram`, to check if any two strings are anagrams

    An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
    original letters exactly once.

        Ex: "CAT" & "ACT",
            "ARMY" & "MARY",
            "FART" & "RAFT"
    */

    //Implement Here
     public static boolean isAnagram(String word1, String word2) {

         char[] firstWord = word1.toCharArray();
         char[] secondWord = word2.toCharArray();
         Arrays.sort(firstWord);
         Arrays.sort(secondWord);
         return Arrays.equals(firstWord, secondWord);

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("CAT", "ACT") );
        System.out.println(isAnagram("ARMY", "MARY") );
        System.out.println(isAnagram("FART", "RAFT") );
    }

}
