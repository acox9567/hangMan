//Alexander Cox
//Thursday, September 9, 2018

import java.util.Scanner;

public class game {

    public static void main(String[] args) {

        System.out.println("Player 1; enter a word or phrase, and make sure player 2 can't see it.");
        System.out.println("It can include any kind of character except for lowercase letters.");
        System.out.print("\033[H\033[2J");

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        word.toUpperCase();
        String hWord = "";
        String gWord = "";
        int lives = 10;

        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

        for (int i = 0; i < word.length(); i++)
            hWord += "_ ";

        System.out.println("Player 2; start making guesses for letters that the word or phrase might contain.  You have 10 lives and will lose one for each incorrect guess.");

        String guess = "";

        while (gWord != word && lives != 0) {

            System.out.println(hWord);
            guess = input.nextLine();

            if (word.indexOf(guess) < 0) {
                lives--;
                System.out.println("'" + guess + "' is not in the word, you only have " + lives + " lives left.");
            } else {
                String sub1 = hWord.substring(0, (word.indexOf(guess) * 2));
                String sub2 = guess + " ";
                String sub3 = hWord.substring(word.indexOf(guess) * 2 + 2);
            }
        }

        if (lives == 0) {
            System.out.println("Player 1 wins! The word was" + word);
        }
        else{
            System.out.println("Player 2 wins! The word was" + word);

        }
    }
}

