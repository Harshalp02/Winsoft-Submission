//Write a Java Program to find the duplicate characters in a string.
// With CaseSenitive
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
class Solution {

    static void findDuplicates(String input){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i <input.length() ; i++) {
            char chr = input.charAt(i);
            if(map.containsKey(chr)){
                int count = map.get(chr);
                map.put(chr, ++count);
            }else{
                map.put(chr, 1);
            }
        }
        Set<Character> set = map.keySet();
        System.out.println("Duplicate Characters: ");
        for (Character chr: set){
            int count = map.get(chr);
            if(count>1){
                System.out.println(chr + " - " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	String input =sc.nextLine();
        findDuplicates(input);
    }
}

/*output
 Harshal Patil
Duplicate Characters:
a - 3
l - 2
*/


//Without CaseSensitive

/*import java.util.HashMap;
import java.util.Set;
class Solution{

    static void findDuplicates(String input){
        HashMap<Character, Integer> map = new HashMap<>();

        // Convert input string to lowercase or uppercase
        input = input.toLowerCase(); // or input.toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            char chr = input.charAt(i);
            if (chr != ' ') { // excluding spaces from consideration
                if (map.containsKey(chr)) {
                    int count = map.get(chr);
                    map.put(chr, ++count);
                } else {
                    map.put(chr, 1);
                }
            }
        }

        // iterate through Hash Map and print all the duplicates chars
        Set<Character> set = map.keySet();
        System.out.println("Duplicate Characters: ");
        for (Character chr: set){
            int count = map.get(chr);
            if(count>1){
                System.out.println(chr + " - " + count);
            }
        }
    }

    public static void main(String[] args) {
        String input = "Harshal Patil";
        findDuplicates(input);
    }
}*/
/*output
Duplicate Characters:
a - 3
h - 2
l - 2
*/

