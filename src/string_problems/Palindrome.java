package string_problems;

public class Palindrome {

    /*
      A palindrome is a word that can be reversed, and still remain the same.
      Example: MOM, DAD, MADAM, RACECAR

      Create a method to check if any given String is a palindrome or not.
     */

    // Implement here
    public boolean isPalindrome(String str) {
        String reversedString = "";
        for (int i = str.length() -1; i  >= 0; i--)
            reversedString = reversedString +str.charAt(i);

        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+reversedString);

        return str.equals(reversedString);
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome("racecar"));


    }
}