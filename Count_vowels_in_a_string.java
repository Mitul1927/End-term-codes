public class CountVowels {
    // Function to count vowels
    public static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Programming is fun!";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
