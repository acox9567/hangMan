//Alexander Cox
//Thursday, September 9, 2018

import java.util.Scanner;

public class game {

    public static void main(String[] args){

        System.out.println("Player 1; enter a word or phrase, and make sure player 2 can't see it.");
        System.out.println("It can include any kind of character.");

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.println("Player 2; start making guesses for letters that the word or phrase might contain.");
    }
}
