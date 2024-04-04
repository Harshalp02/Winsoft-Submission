/*:Write a Java Program to count the number of words in a string using HashMap.*/


// Without CaseSensitive
//

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String userInput = scanner.nextLine();

        Map<String, Integer> wordCounts = countWords(userInput);

        System.out.println("Occurrences of each word (case-insensitive):");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Remove punctuation and split the input into words
        String[] words = input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        // Count occurrences of each word
        for (String word : words) {
            if (!word.isEmpty()) { // Ignore empty strings after removing punctuation
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}

/*output:Enter your string:
hello Harshal Patil Hello Harshal patil
Occurrences of each word (case-insensitive):
harshal: 2
hello: 2
patil: 2*/

// Case Sensitive
//
/*import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String userInput = scanner.nextLine();

        Map<String, Integer> wordCounts = countWords(userInput);

        System.out.println("Occurrences of each word:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Remove punctuation and split the input into words
        String[] words = input.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        // Count occurrences of each word
        for (String word : words) {
            if (!word.isEmpty()) { // Ignore empty strings after removing punctuation
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}*/
/*Enter your string:
Hello Harshal Patil hii hello Harshal Patil
Occurrences of each word:
Patil: 2
Hello: 1
hii: 1
Harshal: 2
hello: 1*/
