public class StringHandlingDemo {
    public static void main(String[] args) {
        // Initialize a sample string
        String sampleString = "Hello, World! This is a Java program.";

        // Display the original string
        System.out.println("Original String: " + sampleString);

        // Get the length of the string
        int length = sampleString.length();
        System.out.println("Length of the String: " + length);

        // Convert the string to uppercase
        String upperCaseString = sampleString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);

        // Convert the string to lowercase
        String lowerCaseString = sampleString.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseString);

        // Check if the string contains a specific substring
        boolean containsSubstring = sampleString.contains("Java");
        System.out.println("String contains 'Java': " + containsSubstring);

        // Find the index of a specific character or substring
        int index = sampleString.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // Extract a substring from the original string
        String substring = sampleString.substring(13, 24);
        System.out.println("Substring from index 13 to 24: " + substring);

        // Replace a substring in the original string
        String replacedString = sampleString.replace("Java", "programming");
        System.out.println("String after replacing 'Java': " + replacedString);

        // Split the string into an array of substrings
        String[] words = sampleString.split(" ");
        System.out.println("Split the string into words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Trim leading and trailing whitespace from a string
        String stringWithWhitespace = "   Trim me!   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Trimmed String: " + trimmedString);
    }
}
