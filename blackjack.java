import java.util.*;

public class blackjack {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack!");

        List<Integer> playerHand = new ArrayList<>();
        List<Integer> dealerHand = new ArrayList<>();

        // Initial cards
        playerHand.add(drawCard());
        playerHand.add(drawCard());
        dealerHand.add(drawCard());
        dealerHand.add(drawCard());

        System.out.println("Your cards: " + playerHand + " | Total: " + calculateTotal(playerHand));
        System.out.println("Dealer's first card: " + dealerHand.get(0));

        // Player turn
        while (true) {
            System.out.print("Do you want to Hit or Stand? (H/S): ");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("H")) {
                playerHand.add(drawCard());
                System.out.println("Your cards: " + playerHand + " | Total: " + calculateTotal(playerHand));

                if (calculateTotal(playerHand) > 21) {
                    System.out.println("You busted! Dealer wins.");
                    return;
                }
            } else if (choice.equals("S")) {
                break;
            } else {
                System.out.println("Invalid input! Type H or S.");
            }
        }

        // Dealer turn
        System.out.println("Dealer's cards: " + dealerHand + " | Total: " + calculateTotal(dealerHand));
        while (calculateTotal(dealerHand) < 17) {
            dealerHand.add(drawCard());
            System.out.println("Dealer draws a card: " + dealerHand + " | Total: " + calculateTotal(dealerHand));
        }

        int playerTotal = calculateTotal(playerHand);
        int dealerTotal = calculateTotal(dealerHand);

        // Determine winner
        if (dealerTotal > 21) {
            System.out.println("Dealer busted! You win.");
        } else if (playerTotal > dealerTotal) {
            System.out.println("You win!");
        } else if (playerTotal < dealerTotal) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    // Draws a card between 1 and 11 (simulating Ace as 11)
    static int drawCard() {
        int card = random.nextInt(13) + 1;
        if (card >= 10) return 10; // face cards
        if (card == 1) return 11;  // Ace as 11
        return card;
    }

    // Calculates the total, adjusting Aces from 11 to 1 if needed
    static int calculateTotal(List<Integer> hand) {
        int total = 0;
        int aceCount = 0;

        for (int card : hand) {
            total += card;
            if (card == 11) aceCount++;
        }

        while (total > 21 && aceCount > 0) {
            total -= 10;  // convert one Ace from 11 to 1
            aceCount--;
        }

        return total;
    }
}
