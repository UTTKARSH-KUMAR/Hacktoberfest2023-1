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
