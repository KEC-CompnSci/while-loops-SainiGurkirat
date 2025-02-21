
import java.util.Scanner;

public class Assignment {
    // DO NOT MODIFY THIS SCANNER
    // This will be used to autograde your solution
    public static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
      String repeated = repeatWord("", 0);
      System.out.println(repeated);
      String pyramid = createPyramid(5);
      String FizzBuzz = countTo(50);
      
    }
    
    /**
     * Exercise 1: Word Repeater
     * Repeat the provided word the specified number of times
     * Example: word="hello" times=3 → "hello hello hello"
     */
    public static String repeatWord(String word, int times) {
       
        // TODO: Implement this method
        // Use a while loop to build a string that repeats the word
        // Words should be separated by single spaces
        // No trailing space at the end

        String repeatedWords = word; 
        if(times == 0){
            return "";
        }
        while(times > 1){
            repeatedWords = repeatedWords + " " + word;
            times--;
        }

        return repeatedWords;
        
    
    }
    
    /**
     * Exercise 2: Number Pyramid
     * Create a string pyramid of numbers from 1 to maxNumber
     * Example: maxNumber=3 →
     * 1
     * 22
     * 333
     */
    public static String createPyramid(int maxNumber) {
        // TODO: Implement this method
        // Use nested while loops:
        // - Outer loop for each row
        // - Inner loop to repeat the number
        // Use \n for newlines
        
        String pyramidString = "";
        for(int i = 1; i <= maxNumber; i++){
        // inner lines
            for(int line = 1; line <= i; line++){
            // continues to add number to string till condition is met
                pyramidString = pyramidString + i;
            }
        // next line of the pyramid
            pyramidString += "\n";
        }

        return pyramidString;
    }
    
 
    
    
    /**
     * Exercise 3: Counting Game
     * Return a string of numbers replacing:
     * - Multiples of 3 with "Fizz"
     * - Multiples of 5 with "Buzz"
     * - Multiples of both with "FizzBuzz"
     * Example: countTo(6) → "1 2 Fizz 4 Buzz Fizz"
     */
    public static String countTo(int maxNumber) {
        // TODO: Implement this method
        // Use a while loop
        // Use string concatenation
        // Numbers/words should be separated by spaces
        // No trailing space at the end

        String count = "1";

        for(int i = 2; i <= maxNumber; i++){  
            if(i % 15 == 0){
                count += " FizzBuzz";
            }else if (i % 3 == 0){
                count += " Fizz";
            }else if (i % 5 == 0) {
                count += " Buzz";
            }else count += " " + i;
            
        }
        

        return count;
    }
}