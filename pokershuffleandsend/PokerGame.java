package demo02;
import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        String[] suits = {"♦", "♣", "♥", "♠"};
        String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        cards.add("Red Joker");
        cards.add("Grey Joker");
        for (String suit : suits) {
            for (String num : nums) {
                cards.add(suit+num);
            }
        }
        Collections.shuffle(cards);
        System.out.println(cards);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> rest3 = new ArrayList<>();
        for (int i = 0; i < cards.size(); i++) {
            if (i > 50){
                rest3.add(cards.get(i));
            }
            else if (i % 3 == 0) {
                player1.add(cards.get(i));
            }
            else if(i % 3 == 1){
                player2.add(cards.get(i));
            }
            else if(i % 3 == 2){
                player3.add(cards.get(i));
            }
        }
        System.out.println("Player1 cards:"+player1);
        System.out.println("Player2 cards:"+player2);
        System.out.println("Player3 cards:"+player3);
        System.out.println("The rest 3:"+rest3);
    }
}
