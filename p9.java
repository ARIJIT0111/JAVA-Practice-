// TO CHECK WHETHER THE GIVEN CHARACTER IS VOWEL OR NOT

import java.util.Scanner;
 public class p9 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");

        char ch = sc.next().charAt(0);

        // Check if the character is one of the vowels
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel or is a consonant");
        }
        sc.close();
    }
  }
