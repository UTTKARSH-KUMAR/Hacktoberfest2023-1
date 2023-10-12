/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:

Input: s = " fly me to the moon "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s. */

import java.util.Scanner;

public class Length_Of_Last_Word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        int result1 = lengthOfLastWord(s1);
        int result2 = lengthOfLastWord(s2);
        int result3 = lengthOfLastWord(s3);

        System.out.println("Output for '" + s1 + "': " + result1);
        System.out.println("Output for '" + s2 + "': " + result2);
        System.out.println("Output for '" + s3 + "': " + result3);
    }

    public static int lengthOfLastWord(String s) {
        // Trim the input string to remove leading and trailing spaces
        String trimmedString = s.trim();
        
        // Split the trimmed string by space character
        String[] words = trimmedString.split(" ");
        
        // Get the last word from the array and return its length
        return words[words.length - 1].length();
    }
}
