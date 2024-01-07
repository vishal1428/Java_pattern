///*
//Write an application that encodes English language phrases into Double Dutch using the following algorithm:
//To form a Double Dutch sentence from an English sentence,
//translate each English word into a Double Dutch word,
//place the first letter of the English word at the end of the word and add the letters "ay."
//Thus the word "jump" becomes "umpjay," the word "the" becomes "hetay," and the word "ignite" becomes "gniteiay."
//
//Blanks between words remain as blanks.  Assume that the English sentence consists of words separated by blanks,
//there are no punctuation marks and all words have two or more letters.
//
//Write a program to print the Double Dutch Word that takes as input a word and prints the Double Dutch equivalent.
//Assume all letters are lowercase.
//
//Input Specification: A line containing text to be converted.
//Output Specification: The double dutch text line.
//
//Sample input : this is ignite
//Sample Output : histay siay gniteiay
// */
import java.util.Scanner;
public class Double_Dutch {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] words = input.split(" ");

            for (String word : words) {
                if (word.length() > 1) {
                    System.out.print(word.substring(1, word.length() - 1) + word.charAt(word.length() - 1) + word.charAt(0) + "ay ");
                } else {
                    System.out.print(word + "ay ");
                }
            }
        }
    }
