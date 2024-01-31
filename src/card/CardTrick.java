/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {
        // Generate a hand of seven random cards
        String[] hand = generateRandomHand();

        // Print the generated hand
        System.out.println("Generated Hand:");
        for (String card : hand) {
            System.out.println(card);
        }

        // Ask the user to pick a card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card (e.g., 7 of Diamonds): ");
        String userCard = scanner.nextLine();

        // Search the array for the user's card
        boolean isCardInHand = isCardInHand(userCard, hand);

        // Report the result
        if (isCardInHand) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }

    private static String[] generateRandomHand() {
        String[] hand = new String[7];
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            String suit = suits[random.nextInt(suits.length)];
            String rank = ranks[random.nextInt(ranks.length)];
            hand[i] = rank + " of " + suit;
        }

        return hand;
    }

    private static boolean isCardInHand(String card, String[] hand) {
        // Check if the user's card is in the hand
        for (String handCard : hand) {
            if (handCard.equals(card)) {
                return true;
            }
        }
        return false;
    }
}
